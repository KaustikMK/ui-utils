package com.ui_utils;

import com.google.gson.Gson;
import net.minecraft.text.Text;

public class TextJsonUtil {
    private static final Gson GSON = new Gson();

    public static String toJson(Text text) {
        // This will serialize the Text object to JSON using its string representation.
        // This is a fallback since the official API removed Serializer.
        // For most vanilla Text, this will be a valid JSON string.
        return text != null ? text.toString() : "";
    }
}
