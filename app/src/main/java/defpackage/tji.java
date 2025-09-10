package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tji {
    private static final int a;

    static {
        int i;
        String property = System.getProperty("java.version");
        try {
            String[] strArrSplit = property.split("[._]", 3);
            i = Integer.parseInt(strArrSplit[0]);
            if (i == 1) {
                i = strArrSplit.length > 1 ? Integer.parseInt(strArrSplit[1]) : 1;
            }
        } catch (NumberFormatException unused) {
            i = -1;
        }
        if (i == -1) {
            try {
                StringBuilder sb = new StringBuilder();
                for (int i2 = 0; i2 < property.length(); i2++) {
                    char cCharAt = property.charAt(i2);
                    if (!Character.isDigit(cCharAt)) {
                        break;
                    }
                    sb.append(cCharAt);
                }
                i = Integer.parseInt(sb.toString());
            } catch (NumberFormatException unused2) {
                i = -1;
            }
        }
        if (i == -1) {
            i = 6;
        }
        a = i;
    }

    public static boolean a() {
        return a >= 9;
    }
}
