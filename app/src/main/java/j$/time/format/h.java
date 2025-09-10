package j$.time.format;

/* loaded from: classes3.dex */
public final class h implements e {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ h(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static void a(StringBuilder sb, int i) {
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
    }

    @Override // j$.time.format.e
    public final boolean h(u uVar, StringBuilder sb) {
        switch (this.a) {
            case 0:
                Long lA = uVar.a(j$.time.temporal.a.OFFSET_SECONDS);
                if (lA == null) {
                    return false;
                }
                sb.append("GMT");
                long jLongValue = lA.longValue();
                int i = (int) jLongValue;
                if (jLongValue != i) {
                    throw new ArithmeticException();
                }
                if (i != 0) {
                    int iAbs = Math.abs((i / 3600) % 100);
                    int iAbs2 = Math.abs((i / 60) % 60);
                    int iAbs3 = Math.abs(i % 60);
                    sb.append(i < 0 ? "-" : "+");
                    if (((B) this.b) == B.FULL) {
                        a(sb, iAbs);
                        sb.append(':');
                        a(sb, iAbs2);
                        if (iAbs3 != 0) {
                            sb.append(':');
                            a(sb, iAbs3);
                        }
                    } else {
                        if (iAbs >= 10) {
                            sb.append((char) ((iAbs / 10) + 48));
                        }
                        sb.append((char) ((iAbs % 10) + 48));
                        if (iAbs2 != 0 || iAbs3 != 0) {
                            sb.append(':');
                            a(sb, iAbs2);
                            if (iAbs3 != 0) {
                                sb.append(':');
                                a(sb, iAbs3);
                            }
                        }
                    }
                }
                return true;
            default:
                sb.append((String) this.b);
                return true;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "LocalizedOffset(" + String.valueOf((B) this.b) + ")";
            default:
                return "'" + ((String) this.b).replace("'", "''") + "'";
        }
    }
}
