package j$.util;

import j$.time.ZoneId;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public class DesugarTimeZone {
    public static TimeZone getTimeZone(String str) {
        return TimeZone.getTimeZone(str);
    }

    public static TimeZone getTimeZone(ZoneId zoneId) {
        String strF = zoneId.f();
        char cCharAt = strF.charAt(0);
        if (cCharAt == '+' || cCharAt == '-') {
            strF = "GMT".concat(strF);
        } else if (cCharAt == 'Z' && strF.length() == 1) {
            strF = "UTC";
        }
        return TimeZone.getTimeZone(strF);
    }
}
