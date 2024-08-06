package com.xiaomi.miliMap.common.utils;

import com.google.gson.*;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: GsonUtils
 * @Description:GSON工具栏
 * @Author: yinshuo
 * @Date: 2024/8/6
 */

public class GsonUtils {

    private static ThreadLocal<Gson> gsonThreadLocal = ThreadLocal.withInitial(Gson::new);

    public static Gson getGson() {
        return gsonThreadLocal.get();
    }

    /**
     *  将json字符串转换为对象
     * @param str str
     * @param clazz 对象
     * @return 对应的对象
     * @param <T> 类型参数
     */
    public static <T> T parseObject(String str,Class<T> clazz){
        if (StringUtils.isBlank(str)){
            return null;
        }

        return getGson().fromJson(str,clazz);
    }

    /**
     *  将json字符串转换为对象数组
     * @param str str
     * @param clazz 对象
     * @return 对应的对象
     * @param <T> 类型参数
     */
    public static <T> List<T>  parseArray(String str,Class<T[]> clazz){
        if (StringUtils.isBlank(str)){
            return null;
        }
        T[] array = getGson().fromJson(str, clazz);
        return new ArrayList<>(Arrays.asList(array));
    }

    /**
     *  将对象转换为json字符串
     * @param t 对象
     * @return json字符串
     * @param <T> 类型参数
     */
    public static <T> String toString(T t){
        if (t == null) {
            return null;
        }

        return getGson().toJson(t);
    }

    public static JsonObject toJsonObj(String result) {
        return JsonParser.parseString(result).getAsJsonObject();
    }

    public static int optInt(JsonObject jsonObject, String key) {
        return jsonObject.has(key) ? jsonObject.get(key).getAsInt() : 0;
    }

    public static int optInt(JsonObject jsonObject, String key, int defaultValue) {
        return jsonObject.has(key) ? jsonObject.get(key).getAsInt() : defaultValue;
    }

    public static JsonArray optJsonArray(JsonObject jsonObject, String key) {
        return jsonObject.has(key) ? jsonObject.get(key).getAsJsonArray() : new JsonArray();
    }

    public static JsonObject optJsonObject(JsonObject jsonObject, String key) {
        return jsonObject.has(key) ? jsonObject.get(key).getAsJsonObject() : new JsonObject();
    }

    public static String optString(JsonObject jsonObject, String key) {
        return jsonObject.has(key) ? jsonObject.get(key).getAsString() : "";
    }

    public static Long optLong(JsonObject jsonObject, String key) {
        return jsonObject.has(key) ? jsonObject.get(key).getAsLong() : 0L;
    }

    public static boolean optBoolean(JsonObject jsonObject, String key) {
        return jsonObject.has(key) && jsonObject.get(key).getAsBoolean();
    }

    public static JsonObject mapToJson(Map<String,Object> map) {
        JsonElement jsonElement = getGson().toJsonTree(map);

        // 将 JsonElement 转换为 JsonObject
        return jsonElement.getAsJsonObject();
    }

    public static <T> JsonObject mapObjToJsonObj(T t) {
        return getGson().toJsonTree(t).getAsJsonObject();
    }

    public static <T> JsonArray mapListToJsonArray(List<T> datas) {
        if(CollectionUtils.isEmpty(datas)) {
            return new JsonArray();
        }

        return getGson().toJsonTree(datas).getAsJsonArray();
    }
}
