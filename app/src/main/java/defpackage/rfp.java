package defpackage;

import android.util.Log;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rfp implements rfo {
    private static final String b = "rfp";
    public final Map a = new HashMap();

    private static String f(CharSequence charSequence) {
        String string = charSequence.toString();
        StringBuilder sb = new StringBuilder();
        int iCharCount = 0;
        while (iCharCount < string.length()) {
            int iCodePointAt = string.codePointAt(iCharCount);
            if (iCharCount == 0) {
                if (iCodePointAt == 95 || h((byte) Character.getType(iCodePointAt))) {
                    sb.appendCodePoint(iCodePointAt);
                } else {
                    sb.append('_');
                    if (i(iCodePointAt)) {
                        sb.appendCodePoint(iCodePointAt);
                    }
                }
            } else if (i(iCodePointAt)) {
                sb.appendCodePoint(iCodePointAt);
            } else {
                sb.append('_');
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return sb.toString();
    }

    private final void g(String str, String str2) {
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            throw new IllegalArgumentException("Cannot have an XML attribute with no name.");
        }
        Map map = this.a;
        if (!map.containsKey(strTrim)) {
            map.put(strTrim, str2);
        } else {
            Log.w(b, "Attribute has already been added for node: ".concat(String.valueOf(strTrim)));
        }
    }

    private static boolean h(byte b2) {
        return b2 == 2 || b2 == 1 || b2 == 3 || b2 == 5 || b2 == 10;
    }

    private static boolean i(int i) {
        if (i != 45 && i != 46) {
            byte type = (byte) Character.getType(i);
            if (!h(type) && type != 6 && type != 7 && type != 8 && type != 4 && type != 9) {
                return false;
            }
        }
        return true;
    }

    public final void a(XmlSerializer xmlSerializer, qas qasVar) throws IllegalStateException, IOException, IllegalArgumentException {
        Map map = this.a;
        for (String str : map.keySet()) {
            xmlSerializer.attribute("", qasVar != null ? qasVar.d(str) : str, (String) map.get(str));
        }
    }

    @Override // defpackage.rfo
    public final void b(CharSequence charSequence, CharSequence charSequence2) {
        String string;
        String strF = f(charSequence);
        if (charSequence2 != null) {
            String string2 = charSequence2.toString();
            StringBuilder sb = new StringBuilder();
            int iCharCount = 0;
            while (iCharCount < string2.length()) {
                int iCodePointAt = string2.codePointAt(iCharCount);
                if ((iCodePointAt <= 0 || iCodePointAt > 8) && ((iCodePointAt < 11 || iCodePointAt > 12) && ((iCodePointAt < 14 || iCodePointAt > 31) && ((iCodePointAt < 127 || iCodePointAt > 132) && ((iCodePointAt < 134 || iCodePointAt > 159) && ((iCodePointAt < 64976 || iCodePointAt > 64991) && ((iCodePointAt < 131070 || iCodePointAt > 131071) && ((iCodePointAt < 196606 || iCodePointAt > 196607) && ((iCodePointAt < 262142 || iCodePointAt > 262143) && ((iCodePointAt < 327678 || iCodePointAt > 327679) && ((iCodePointAt < 393214 || iCodePointAt > 393215) && ((iCodePointAt < 458750 || iCodePointAt > 458751) && ((iCodePointAt < 524286 || iCodePointAt > 524287) && ((iCodePointAt < 589822 || iCodePointAt > 589823) && ((iCodePointAt < 655358 || iCodePointAt > 655359) && ((iCodePointAt < 720894 || iCodePointAt > 720895) && ((iCodePointAt < 786430 || iCodePointAt > 786431) && ((iCodePointAt < 851966 || iCodePointAt > 851967) && ((iCodePointAt < 917502 || iCodePointAt > 917503) && ((iCodePointAt < 983038 || iCodePointAt > 983039) && ((iCodePointAt < 1048574 || iCodePointAt > 1048575) && (iCodePointAt < 1114110 || iCodePointAt > 1114111)))))))))))))))))))))) {
                    sb.appendCodePoint(iCodePointAt);
                } else {
                    sb.append("-");
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            string = sb.toString();
        } else {
            string = "";
        }
        g(strF, string);
    }

    @Override // defpackage.rfo
    public final void c(CharSequence charSequence, boolean z) {
        throw null;
    }

    @Override // defpackage.rfo
    public final void d(CharSequence charSequence, float f) {
        throw null;
    }

    @Override // defpackage.rfo
    public final void e(CharSequence charSequence, int i) {
        g(f(charSequence), Integer.toString(i));
    }
}
