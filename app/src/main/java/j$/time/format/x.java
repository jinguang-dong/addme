package j$.time.format;

import j$.util.concurrent.ConcurrentHashMap;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;

/* loaded from: classes3.dex */
public class x {
    public static final ConcurrentHashMap a = new ConcurrentHashMap(16, 0.75f, 2);
    public static final v b = new v();
    public static final x c = new x();

    public String a(j$.time.chrono.l lVar, j$.time.temporal.l lVar2, long j, B b2, Locale locale) {
        if (lVar == j$.time.chrono.s.c || !(lVar2 instanceof j$.time.temporal.a)) {
            return b(lVar2, j, b2, locale);
        }
        return null;
    }

    public String b(j$.time.temporal.l lVar, long j, B b2, Locale locale) {
        Object wVar;
        long j2;
        String strSubstring;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(lVar, locale);
        ConcurrentHashMap concurrentHashMap = a;
        Object obj = concurrentHashMap.get(simpleImmutableEntry);
        if (obj == null) {
            HashMap map = new HashMap();
            if (lVar == j$.time.temporal.a.ERA) {
                DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
                HashMap map2 = new HashMap();
                HashMap map3 = new HashMap();
                String[] eras = dateFormatSymbols.getEras();
                for (int i = 0; i < eras.length; i++) {
                    if (!eras[i].isEmpty()) {
                        long j3 = i;
                        map2.put(Long.valueOf(j3), eras[i]);
                        Long lValueOf = Long.valueOf(j3);
                        String str = eras[i];
                        map3.put(lValueOf, str.substring(0, Character.charCount(str.codePointAt(0))));
                    }
                }
                if (!map2.isEmpty()) {
                    map.put(B.FULL, map2);
                    map.put(B.SHORT, map2);
                    map.put(B.NARROW, map3);
                }
                wVar = new w(map);
            } else {
                long j4 = 1;
                if (lVar == j$.time.temporal.a.MONTH_OF_YEAR) {
                    int length = DateFormatSymbols.getInstance(locale).getMonths().length;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    for (long j5 = 1; j5 <= length; j5++) {
                        String strZ = j$.desugar.sun.nio.fs.g.z(j5, "LLLL", locale);
                        linkedHashMap.put(Long.valueOf(j5), strZ);
                        linkedHashMap2.put(Long.valueOf(j5), strZ.substring(0, Character.charCount(strZ.codePointAt(0))));
                        linkedHashMap3.put(Long.valueOf(j5), j$.desugar.sun.nio.fs.g.z(j5, "LLL", locale));
                    }
                    if (length > 0) {
                        map.put(B.FULL_STANDALONE, linkedHashMap);
                        map.put(B.NARROW_STANDALONE, linkedHashMap2);
                        map.put(B.SHORT_STANDALONE, linkedHashMap3);
                        map.put(B.FULL, linkedHashMap);
                        map.put(B.NARROW, linkedHashMap2);
                        map.put(B.SHORT, linkedHashMap3);
                    }
                    wVar = new w(map);
                } else if (lVar == j$.time.temporal.a.DAY_OF_WEEK) {
                    int length2 = DateFormatSymbols.getInstance(locale).getWeekdays().length;
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                    LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                    LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                    boolean z = locale == Locale.SIMPLIFIED_CHINESE || locale == Locale.TRADITIONAL_CHINESE;
                    long j6 = 1;
                    while (j6 <= length2) {
                        String strY = j$.desugar.sun.nio.fs.g.y(j6, "cccc", locale);
                        linkedHashMap4.put(Long.valueOf(j6), strY);
                        Long lValueOf2 = Long.valueOf(j6);
                        if (z) {
                            j2 = j4;
                            strSubstring = new StringBuilder().appendCodePoint(strY.codePointBefore(strY.length())).toString();
                        } else {
                            j2 = j4;
                            strSubstring = strY.substring(0, Character.charCount(strY.codePointAt(0)));
                        }
                        linkedHashMap5.put(lValueOf2, strSubstring);
                        linkedHashMap6.put(Long.valueOf(j6), j$.desugar.sun.nio.fs.g.y(j6, "ccc", locale));
                        j6 += j2;
                        j4 = j2;
                    }
                    if (length2 > 0) {
                        map.put(B.FULL_STANDALONE, linkedHashMap4);
                        map.put(B.NARROW_STANDALONE, linkedHashMap5);
                        map.put(B.SHORT_STANDALONE, linkedHashMap6);
                        map.put(B.FULL, linkedHashMap4);
                        map.put(B.NARROW, linkedHashMap5);
                        map.put(B.SHORT, linkedHashMap6);
                    }
                    wVar = new w(map);
                } else if (lVar == j$.time.temporal.a.AMPM_OF_DAY) {
                    DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
                    HashMap map4 = new HashMap();
                    HashMap map5 = new HashMap();
                    String[] amPmStrings = dateFormatSymbols2.getAmPmStrings();
                    for (int i2 = 0; i2 < amPmStrings.length; i2++) {
                        if (!amPmStrings[i2].isEmpty()) {
                            long j7 = i2;
                            map4.put(Long.valueOf(j7), amPmStrings[i2]);
                            Long lValueOf3 = Long.valueOf(j7);
                            String str2 = amPmStrings[i2];
                            map5.put(lValueOf3, str2.substring(0, Character.charCount(str2.codePointAt(0))));
                        }
                    }
                    if (!map4.isEmpty()) {
                        map.put(B.FULL, map4);
                        map.put(B.SHORT, map4);
                        map.put(B.NARROW, map5);
                    }
                    wVar = new w(map);
                } else {
                    wVar = "";
                }
            }
            concurrentHashMap.putIfAbsent(simpleImmutableEntry, wVar);
            obj = concurrentHashMap.get(simpleImmutableEntry);
        }
        if (obj instanceof w) {
            return ((w) obj).a(j, b2);
        }
        return null;
    }
}
