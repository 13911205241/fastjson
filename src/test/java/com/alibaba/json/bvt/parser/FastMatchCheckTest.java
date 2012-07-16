package com.alibaba.json.bvt.parser;

import junit.framework.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.parser.JSONToken;
import com.alibaba.fastjson.parser.deserializer.ArrayDeserializer;
import com.alibaba.fastjson.parser.deserializer.ArrayListStringDeserializer;
import com.alibaba.fastjson.parser.deserializer.CharacterDeserializer;
import com.alibaba.fastjson.parser.deserializer.FileDeserializer;
import com.alibaba.fastjson.parser.deserializer.InetAddressDeserializer;
import com.alibaba.fastjson.parser.deserializer.InetSocketAddressDeserializer;
import com.alibaba.fastjson.parser.deserializer.JSONArrayDeserializer;
import com.alibaba.fastjson.parser.deserializer.JSONObjectDeserializer;
import com.alibaba.fastjson.parser.deserializer.LocaleDeserializer;
import com.alibaba.fastjson.parser.deserializer.NumberDeserializer;
import com.alibaba.fastjson.parser.deserializer.SimpleTypeDeserializer;
import com.alibaba.fastjson.parser.deserializer.TimestampDeserializer;

public class FastMatchCheckTest extends TestCase {
    public void test_match() throws Exception {
        Assert.assertEquals(JSONToken.LBRACKET, ArrayListStringDeserializer.instance.getFastMatchToken());
        Assert.assertEquals(JSONToken.LITERAL_STRING, InetAddressDeserializer.instance.getFastMatchToken());
        Assert.assertEquals(JSONToken.LITERAL_STRING, LocaleDeserializer.instance.getFastMatchToken());
        Assert.assertEquals(JSONToken.LITERAL_INT, NumberDeserializer.instance.getFastMatchToken());
        Assert.assertEquals(JSONToken.LITERAL_INT, TimestampDeserializer.instance.getFastMatchToken());
        Assert.assertEquals(JSONToken.LITERAL_STRING, SimpleTypeDeserializer.instance.getFastMatchToken());
        Assert.assertEquals(JSONToken.LITERAL_STRING, FileDeserializer.instance.getFastMatchToken());
        Assert.assertEquals(JSONToken.LBRACKET, JSONArrayDeserializer.instance.getFastMatchToken());
        Assert.assertEquals(JSONToken.LBRACKET, ArrayDeserializer.instance.getFastMatchToken());
        Assert.assertEquals(JSONToken.LBRACE, JSONObjectDeserializer.instance.getFastMatchToken());
        Assert.assertEquals(JSONToken.LBRACE, InetSocketAddressDeserializer.instance.getFastMatchToken());
        Assert.assertEquals(JSONToken.LITERAL_STRING, CharacterDeserializer.instance.getFastMatchToken());
    }
}
