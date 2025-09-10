package j$.time.format;

import j$.util.concurrent.ConcurrentHashMap;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class i implements e {
    public static final ConcurrentHashMap c = new ConcurrentHashMap(16, 0.75f, 2);
    public final FormatStyle a;
    public final FormatStyle b;

    public i(FormatStyle formatStyle, FormatStyle formatStyle2) {
        this.a = formatStyle;
        this.b = formatStyle2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.time.format.e
    public final boolean h(u uVar, StringBuilder sb) {
        j$.time.chrono.l lVarD = j$.desugar.sun.nio.fs.g.D(uVar.a);
        Locale locale = uVar.b.b;
        String strF = lVarD.f();
        String string = locale.toString();
        FormatStyle formatStyle = this.a;
        String strValueOf = String.valueOf(formatStyle);
        FormatStyle formatStyle2 = this.b;
        String str = strF + "|" + string + "|" + strValueOf + String.valueOf(formatStyle2);
        ConcurrentHashMap concurrentHashMap = c;
        DateTimeFormatter dateTimeFormatterQ = (DateTimeFormatter) concurrentHashMap.get(str);
        if (dateTimeFormatterQ == null) {
            DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(formatStyle.ordinal(), formatStyle2.ordinal(), locale);
            if (!(dateTimeInstance instanceof SimpleDateFormat)) {
                throw new UnsupportedOperationException("Can't determine pattern from ".concat(String.valueOf(dateTimeInstance)));
            }
            String pattern = ((SimpleDateFormat) dateTimeInstance).toPattern();
            if (pattern == null) {
                pattern = null;
            } else {
                boolean z = pattern.indexOf(66) != -1;
                boolean z2 = pattern.indexOf(98) != -1;
                if (z || z2) {
                    StringBuilder sb2 = new StringBuilder(pattern.length());
                    int i = 0;
                    char c2 = ' ';
                    while (i < pattern.length()) {
                        char cCharAt = pattern.charAt(i);
                        if (cCharAt != ' ') {
                            if (cCharAt != 'B' && cCharAt != 'b') {
                                sb2.append(cCharAt);
                            }
                        } else if (i == 0 || (c2 != 'B' && c2 != 'b')) {
                            sb2.append(cCharAt);
                        }
                        i++;
                        c2 = cCharAt;
                    }
                    int length = sb2.length() - 1;
                    if (length >= 0 && sb2.charAt(length) == ' ') {
                        sb2.deleteCharAt(length);
                    }
                    pattern = sb2.toString();
                }
            }
            s sVar = new s();
            sVar.g(pattern);
            dateTimeFormatterQ = sVar.q(locale, z.SMART, null);
            DateTimeFormatter dateTimeFormatter = (DateTimeFormatter) concurrentHashMap.putIfAbsent(str, dateTimeFormatterQ);
            if (dateTimeFormatter != null) {
                dateTimeFormatterQ = dateTimeFormatter;
            }
        }
        d dVar = dateTimeFormatterQ.a;
        if (dVar.b) {
            dVar = new d(dVar.a, false);
        }
        dVar.h(uVar, sb);
        return true;
    }

    public final String toString() {
        Object obj = this.a;
        if (obj == null) {
            obj = "";
        }
        String strValueOf = String.valueOf(obj);
        Object obj2 = this.b;
        return "Localized(" + strValueOf + "," + String.valueOf(obj2 != null ? obj2 : "") + ")";
    }
}
