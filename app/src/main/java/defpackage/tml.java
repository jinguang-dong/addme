package defpackage;

import com.google.android.apps.camera.coach.YOHg.INRGuObcrHjSQz;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tml implements Closeable {
    public long d;
    public int e;
    public String f;
    public int[] h;
    private final Reader i;
    private int[] m;
    private String[] n;
    public final char[] a = new char[1024];
    public int b = 0;
    private int j = 0;
    private int k = 0;
    private int l = 0;
    public int c = 0;
    public int g = 1;

    static {
        thu.a = new thu();
    }

    public tml(Reader reader) {
        int[] iArr = new int[32];
        this.m = iArr;
        iArr[0] = 6;
        this.n = new String[32];
        this.h = new int[32];
        this.i = reader;
    }

    private final void A(char c) throws tmn {
        do {
            int i = this.b;
            int i2 = this.j;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = this.a[i];
                if (c2 == c) {
                    this.b = i3;
                    return;
                }
                if (c2 == '\\') {
                    this.b = i3;
                    u();
                    i = this.b;
                    i2 = this.j;
                } else {
                    if (c2 == '\n') {
                        this.k++;
                        this.l = i3;
                    }
                    i = i3;
                }
            }
            this.b = i;
        } while (D(1));
        throw w("Unterminated string");
    }

    private final void B() {
        char c;
        do {
            if (this.b >= this.j && !D(1)) {
                return;
            }
            char[] cArr = this.a;
            int i = this.b;
            int i2 = i + 1;
            this.b = i2;
            c = cArr[i];
            if (c == '\n') {
                this.k++;
                this.l = i2;
                return;
            }
        } while (c != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0047, code lost:
    
        y();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void C() throws defpackage.tmn {
        /*
            r4 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            int r2 = r4.b
            int r2 = r2 + r1
            int r3 = r4.j
            if (r2 >= r3) goto L50
            char[] r3 = r4.a
            char r2 = r3[r2]
            r3 = 9
            if (r2 == r3) goto L4a
            r3 = 10
            if (r2 == r3) goto L4a
            r3 = 12
            if (r2 == r3) goto L4a
            r3 = 13
            if (r2 == r3) goto L4a
            r3 = 32
            if (r2 == r3) goto L4a
            r3 = 35
            if (r2 == r3) goto L47
            r3 = 44
            if (r2 == r3) goto L4a
            r3 = 47
            if (r2 == r3) goto L47
            r3 = 61
            if (r2 == r3) goto L47
            r3 = 123(0x7b, float:1.72E-43)
            if (r2 == r3) goto L4a
            r3 = 125(0x7d, float:1.75E-43)
            if (r2 == r3) goto L4a
            r3 = 58
            if (r2 == r3) goto L4a
            r3 = 59
            if (r2 == r3) goto L47
            switch(r2) {
                case 91: goto L4a;
                case 92: goto L47;
                case 93: goto L4a;
                default: goto L44;
            }
        L44:
            int r1 = r1 + 1
            goto L2
        L47:
            r4.y()
        L4a:
            int r0 = r4.b
            int r0 = r0 + r1
            r4.b = r0
            return
        L50:
            r4.b = r2
            r1 = 1
            boolean r1 = r4.D(r1)
            if (r1 == 0) goto L5a
            goto L1
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tml.C():void");
    }

    private final boolean D(int i) throws IOException {
        int i2;
        int i3 = this.l;
        int i4 = this.b;
        this.l = i3 - i4;
        char[] cArr = this.a;
        int i5 = this.j;
        if (i5 != i4) {
            int i6 = i5 - i4;
            this.j = i6;
            System.arraycopy(cArr, i4, cArr, 0, i6);
        } else {
            this.j = 0;
        }
        this.b = 0;
        do {
            Reader reader = this.i;
            int i7 = this.j;
            int i8 = reader.read(cArr, i7, 1024 - i7);
            if (i8 == -1) {
                return false;
            }
            i2 = this.j + i8;
            this.j = i2;
            if (this.k == 0 && this.l == 0 && i2 > 0 && cArr[0] == 65279) {
                this.b++;
                this.l = 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    private final boolean E(char c) throws tmn {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        y();
        return false;
    }

    private final char u() throws tmn {
        int i;
        if (this.b == this.j && !D(1)) {
            throw w("Unterminated escape sequence");
        }
        char[] cArr = this.a;
        int i2 = this.b;
        int i3 = i2 + 1;
        this.b = i3;
        char c = cArr[i2];
        if (c == '\n') {
            this.k++;
            this.l = i3;
            return c;
        }
        if (c == '\"' || c == '\'' || c == '/' || c == '\\') {
            return c;
        }
        if (c == 'b') {
            return '\b';
        }
        if (c == 'f') {
            return '\f';
        }
        if (c == 'n') {
            return '\n';
        }
        if (c == 'r') {
            return '\r';
        }
        if (c == 't') {
            return '\t';
        }
        if (c != 'u') {
            throw w("Invalid escape sequence");
        }
        if (i2 + 5 > this.j && !D(4)) {
            throw w("Unterminated escape sequence");
        }
        int i4 = this.b;
        int i5 = i4 + 4;
        int i6 = 0;
        while (i4 < i5) {
            int i7 = i6 << 4;
            char c2 = cArr[i4];
            if (c2 >= '0' && c2 <= '9') {
                i = c2 - '0';
            } else if (c2 >= 'a' && c2 <= 'f') {
                i = c2 - 'W';
            } else {
                if (c2 < 'A' || c2 > 'F') {
                    throw w("Malformed Unicode escape \\u".concat(new String(cArr, this.b, 4)));
                }
                i = c2 - '7';
            }
            i6 = i7 + i;
            i4++;
        }
        this.b += 4;
        return (char) i6;
    }

    private final int v(boolean z) throws IOException {
        int i;
        int i2 = this.b;
        int i3 = this.j;
        while (true) {
            if (i2 == i3) {
                this.b = i2;
                if (!D(1)) {
                    if (z) {
                        throw new EOFException("End of input".concat(g()));
                    }
                    return -1;
                }
                i2 = this.b;
                i3 = this.j;
            }
            char[] cArr = this.a;
            int i4 = i2 + 1;
            char c = cArr[i2];
            if (c == '\n') {
                this.k++;
                this.l = i4;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.b = i4;
                    if (i4 == i3) {
                        this.b = i2;
                        boolean zD = D(2);
                        this.b++;
                        if (!zD) {
                            return 47;
                        }
                    }
                    y();
                    int i5 = this.b;
                    char c2 = cArr[i5];
                    if (c2 == '*') {
                        this.b = i5 + 1;
                        while (true) {
                            if (this.b + 2 > this.j && !D(2)) {
                                throw w("Unterminated comment");
                            }
                            int i6 = this.b;
                            if (cArr[i6] != '\n') {
                                while (i < 2) {
                                    i = cArr[this.b + i] == "*/".charAt(i) ? i + 1 : 0;
                                }
                                i2 = this.b + 2;
                                i3 = this.j;
                                break;
                            }
                            this.k++;
                            this.l = i6 + 1;
                            this.b++;
                        }
                    } else {
                        if (c2 != '/') {
                            return 47;
                        }
                        this.b = i5 + 1;
                        B();
                        i2 = this.b;
                        i3 = this.j;
                    }
                } else {
                    if (c != '#') {
                        this.b = i4;
                        return c;
                    }
                    this.b = i4;
                    y();
                    B();
                    i2 = this.b;
                    i3 = this.j;
                }
            }
            i2 = i4;
        }
    }

    private final tmn w(String str) throws tmn {
        throw new tmn(str + g() + "\nSee " + sla.x("malformed-json"));
    }

    private final String x(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.g;
            if (i >= i2) {
                return sb.toString();
            }
            int i3 = this.m[i];
            switch (i3) {
                case 1:
                case 2:
                    int i4 = this.h[i];
                    if (z && i4 > 0 && i == i2 - 1) {
                        i4--;
                    }
                    sb.append('[');
                    sb.append(i4);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.n[i];
                    if (str == null) {
                        break;
                    } else {
                        sb.append(str);
                        break;
                    }
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError(a.bv(i3, "Unknown scope value: "));
            }
            i++;
        }
    }

    private final void y() throws tmn {
        throw w("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
    }

    private final void z(int i) throws tmn {
        int i2 = this.g;
        if (i2 - 1 >= 1280) {
            throw new tmn("Nesting limit 1280 reached" + g());
        }
        int[] iArr = this.m;
        if (i2 == iArr.length) {
            int i3 = i2 + i2;
            this.m = Arrays.copyOf(iArr, i3);
            this.h = Arrays.copyOf(this.h, i3);
            this.n = (String[]) Arrays.copyOf(this.n, i3);
        }
        int[] iArr2 = this.m;
        int i4 = this.g;
        this.g = i4 + 1;
        iArr2[i4] = i;
    }

    public final double a() throws IOException, NumberFormatException {
        int iB = this.c;
        if (iB == 0) {
            iB = b();
        }
        if (iB == 15) {
            this.c = 0;
            int[] iArr = this.h;
            int i = this.g - 1;
            iArr[i] = iArr[i] + 1;
            return this.d;
        }
        if (iB == 16) {
            char[] cArr = this.a;
            int i2 = this.b;
            int i3 = this.e;
            this.f = new String(cArr, i2, i3);
            this.b = i2 + i3;
        } else if (iB == 8 || iB == 9) {
            this.f = i(iB == 8 ? '\'' : '\"');
        } else if (iB == 10) {
            this.f = k();
        } else if (iB != 11) {
            throw d("a double");
        }
        this.c = 11;
        double d = Double.parseDouble(this.f);
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw w("JSON forbids NaN and infinities: " + d);
        }
        this.f = null;
        this.c = 0;
        int[] iArr2 = this.h;
        int i4 = this.g - 1;
        iArr2[i4] = iArr2[i4] + 1;
        return d;
    }

    public final int c() throws IOException, NumberFormatException {
        int iB = this.c;
        if (iB == 0) {
            iB = b();
        }
        if (iB == 15) {
            long j = this.d;
            int i = (int) j;
            if (j == i) {
                this.c = 0;
                int[] iArr = this.h;
                int i2 = this.g - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new NumberFormatException("Expected an int but was " + j + g());
        }
        if (iB == 16) {
            char[] cArr = this.a;
            int i3 = this.b;
            int i4 = this.e;
            this.f = new String(cArr, i3, i4);
            this.b = i3 + i4;
        } else {
            if (iB != 8 && iB != 9 && iB != 10) {
                throw d("an int");
            }
            if (iB == 10) {
                this.f = k();
            } else {
                this.f = i(iB == 8 ? '\'' : '\"');
            }
            try {
                int i5 = Integer.parseInt(this.f);
                this.c = 0;
                int[] iArr2 = this.h;
                int i6 = this.g - 1;
                iArr2[i6] = iArr2[i6] + 1;
                return i5;
            } catch (NumberFormatException unused) {
            }
        }
        this.c = 11;
        double d = Double.parseDouble(this.f);
        int i7 = (int) d;
        if (i7 == d) {
            this.f = null;
            this.c = 0;
            int[] iArr3 = this.h;
            int i8 = this.g - 1;
            iArr3[i8] = iArr3[i8] + 1;
            return i7;
        }
        throw new NumberFormatException("Expected an int but was " + this.f + g());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.c = 0;
        this.m[0] = 8;
        this.g = 1;
        this.i.close();
    }

    public final IllegalStateException d(String str) throws IOException {
        int iT = t();
        String strL = a.L(t());
        String strG = g();
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append(str);
        sb.append(" but was ");
        sb.append(strL);
        sb.append(strG);
        sb.append("\nSee ");
        sb.append(sla.x(iT == 9 ? "adapter-not-null-safe" : "unexpected-json-structure"));
        return new IllegalStateException(sb.toString());
    }

    public final String e() {
        return x(false);
    }

    public final String f() {
        return x(true);
    }

    public final String h() throws IOException {
        String strI;
        int iB = this.c;
        if (iB == 0) {
            iB = b();
        }
        if (iB == 14) {
            strI = k();
        } else if (iB == 12) {
            strI = i('\'');
        } else {
            if (iB != 13) {
                throw d("a name");
            }
            strI = i('\"');
        }
        this.c = 0;
        this.n[this.g - 1] = strI;
        return strI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        r3 = r1 - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        if (r0 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
    
        r0 = new java.lang.StringBuilder(java.lang.Math.max(r3 + r3, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        r0.append(r4, r2, r3);
        r9.b = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String i(char r10) throws defpackage.tmn {
        /*
            r9 = this;
            r0 = 0
        L1:
            int r1 = r9.b
            int r2 = r9.j
            r3 = r2
            r2 = r1
        L7:
            char[] r4 = r9.a
            r5 = 16
            r6 = 1
            if (r1 >= r3) goto L5d
            int r7 = r1 + 1
            char r1 = r4[r1]
            if (r1 != r10) goto L2a
            int r10 = r7 - r2
            int r10 = r10 + (-1)
            r9.b = r7
            if (r0 != 0) goto L22
            java.lang.String r9 = new java.lang.String
            r9.<init>(r4, r2, r10)
            return r9
        L22:
            r0.append(r4, r2, r10)
            java.lang.String r9 = r0.toString()
            return r9
        L2a:
            r8 = 92
            if (r1 != r8) goto L50
            int r1 = r7 - r2
            int r3 = r1 + (-1)
            r9.b = r7
            if (r0 != 0) goto L40
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r1 + r1
            int r1 = java.lang.Math.max(r1, r5)
            r0.<init>(r1)
        L40:
            r0.append(r4, r2, r3)
            char r1 = r9.u()
            r0.append(r1)
            int r2 = r9.b
            int r3 = r9.j
            r1 = r2
            goto L7
        L50:
            r4 = 10
            if (r1 != r4) goto L5b
            int r1 = r9.k
            int r1 = r1 + r6
            r9.k = r1
            r9.l = r7
        L5b:
            r1 = r7
            goto L7
        L5d:
            int r3 = r1 - r2
            if (r0 != 0) goto L6d
            int r0 = r3 + r3
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r0 = java.lang.Math.max(r0, r5)
            r7.<init>(r0)
            r0 = r7
        L6d:
            r0.append(r4, r2, r3)
            r9.b = r1
            boolean r1 = r9.D(r6)
            if (r1 == 0) goto L79
            goto L1
        L79:
            java.lang.String r10 = "Unterminated string"
            tmn r9 = r9.w(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tml.i(char):java.lang.String");
    }

    public final String j() throws IOException {
        String string;
        int iB = this.c;
        if (iB == 0) {
            iB = b();
        }
        if (iB == 10) {
            string = k();
        } else if (iB == 8) {
            string = i('\'');
        } else if (iB == 9) {
            string = i('\"');
        } else if (iB == 11) {
            string = this.f;
            this.f = null;
        } else if (iB == 15) {
            string = Long.toString(this.d);
        } else {
            if (iB != 16) {
                throw d("a string");
            }
            String str = new String(this.a, this.b, this.e);
            this.b += this.e;
            string = str;
        }
        this.c = 0;
        int[] iArr = this.h;
        int i = this.g - 1;
        iArr[i] = iArr[i] + 1;
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0048, code lost:
    
        y();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0042. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String k() throws defpackage.tmn {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r0
        L3:
            int r3 = r5.b
            int r3 = r3 + r2
            int r4 = r5.j
            if (r3 >= r4) goto L4c
            char[] r4 = r5.a
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L59
            r4 = 10
            if (r3 == r4) goto L59
            r4 = 12
            if (r3 == r4) goto L59
            r4 = 13
            if (r3 == r4) goto L59
            r4 = 32
            if (r3 == r4) goto L59
            r4 = 35
            if (r3 == r4) goto L48
            r4 = 44
            if (r3 == r4) goto L59
            r4 = 47
            if (r3 == r4) goto L48
            r4 = 61
            if (r3 == r4) goto L48
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L59
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L59
            r4 = 58
            if (r3 == r4) goto L59
            r4 = 59
            if (r3 == r4) goto L48
            switch(r3) {
                case 91: goto L59;
                case 92: goto L48;
                case 93: goto L59;
                default: goto L45;
            }
        L45:
            int r2 = r2 + 1
            goto L3
        L48:
            r5.y()
            goto L59
        L4c:
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 >= r3) goto L5b
            int r3 = r2 + 1
            boolean r3 = r5.D(r3)
            if (r3 == 0) goto L59
            goto L3
        L59:
            r0 = r2
            goto L7b
        L5b:
            if (r1 != 0) goto L68
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L68:
            char[] r3 = r5.a
            int r4 = r5.b
            r1.append(r3, r4, r2)
            int r3 = r5.b
            int r3 = r3 + r2
            r5.b = r3
            r2 = 1
            boolean r2 = r5.D(r2)
            if (r2 != 0) goto L2
        L7b:
            if (r1 != 0) goto L87
            char[] r1 = r5.a
            java.lang.String r2 = new java.lang.String
            int r3 = r5.b
            r2.<init>(r1, r3, r0)
            goto L92
        L87:
            char[] r2 = r5.a
            int r3 = r5.b
            r1.append(r2, r3, r0)
            java.lang.String r2 = r1.toString()
        L92:
            int r1 = r5.b
            int r1 = r1 + r0
            r5.b = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tml.k():java.lang.String");
    }

    public final void l() throws IOException {
        int iB = this.c;
        if (iB == 0) {
            iB = b();
        }
        if (iB != 3) {
            throw d("BEGIN_ARRAY");
        }
        z(1);
        this.h[this.g - 1] = 0;
        this.c = 0;
    }

    public final void m() throws IOException {
        int iB = this.c;
        if (iB == 0) {
            iB = b();
        }
        if (iB != 1) {
            throw d("BEGIN_OBJECT");
        }
        z(3);
        this.c = 0;
    }

    public final void n() throws IOException {
        int iB = this.c;
        if (iB == 0) {
            iB = b();
        }
        if (iB != 4) {
            throw d("END_ARRAY");
        }
        int i = this.g;
        this.g = i - 1;
        int[] iArr = this.h;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.c = 0;
    }

    public final void o() throws IOException {
        int iB = this.c;
        if (iB == 0) {
            iB = b();
        }
        if (iB != 2) {
            throw d("END_OBJECT");
        }
        int i = this.g;
        int i2 = i - 1;
        this.g = i2;
        this.n[i2] = null;
        int[] iArr = this.h;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.c = 0;
    }

    public final void p() {
        int iB = this.c;
        if (iB == 0) {
            iB = b();
        }
        if (iB != 7) {
            throw d("null");
        }
        this.c = 0;
        int[] iArr = this.h;
        int i = this.g - 1;
        iArr[i] = iArr[i] + 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void q() throws IOException {
        int i = 0;
        do {
            int iB = this.c;
            if (iB == 0) {
                iB = b();
            }
            switch (iB) {
                case 1:
                    z(3);
                    i++;
                    this.c = 0;
                    break;
                case 2:
                    if (i == 0) {
                        this.n[this.g - 1] = null;
                        i = 0;
                    }
                    this.g--;
                    i--;
                    this.c = 0;
                    break;
                case 3:
                    z(1);
                    i++;
                    this.c = 0;
                    break;
                case 4:
                    this.g--;
                    i--;
                    this.c = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.c = 0;
                    break;
                case 8:
                    A('\'');
                    this.c = 0;
                    break;
                case 9:
                    A('\"');
                    this.c = 0;
                    break;
                case 10:
                    C();
                    this.c = 0;
                    break;
                case 12:
                    A('\'');
                    if (i == 0) {
                        this.n[this.g - 1] = "<skipped>";
                        i = 0;
                    }
                    this.c = 0;
                    break;
                case 13:
                    A('\"');
                    if (i == 0) {
                        this.n[this.g - 1] = "<skipped>";
                        i = 0;
                    }
                    this.c = 0;
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    C();
                    if (i == 0) {
                        this.n[this.g - 1] = "<skipped>";
                        i = 0;
                    }
                    this.c = 0;
                    break;
                case 16:
                    this.b += this.e;
                    this.c = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i > 0);
        int[] iArr = this.h;
        int i2 = this.g - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    public final boolean r() throws IOException {
        int iB = this.c;
        if (iB == 0) {
            iB = b();
        }
        return (iB == 2 || iB == 4 || iB == 17) ? false : true;
    }

    public final boolean s() throws IOException {
        int iB = this.c;
        if (iB == 0) {
            iB = b();
        }
        if (iB == 5) {
            this.c = 0;
            int[] iArr = this.h;
            int i = this.g - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iB != 6) {
            throw d("a boolean");
        }
        this.c = 0;
        int[] iArr2 = this.h;
        int i2 = this.g - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    public final int t() throws IOException {
        int iB = this.c;
        if (iB == 0) {
            iB = b();
        }
        switch (iB) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return 5;
            case 15:
            case 16:
                return 7;
            default:
                return 10;
        }
    }

    public final String toString() {
        return String.valueOf(getClass().getSimpleName()).concat(g());
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x01c6, code lost:
    
        r23 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01cc, code lost:
    
        if (E(r13) == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01d0, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01d1, code lost:
    
        if (r9 != r1) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01d3, code lost:
    
        if (r10 == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01d9, code lost:
    
        if (r23 != Long.MIN_VALUE) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01db, code lost:
    
        if (r18 == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01de, code lost:
    
        r8 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01e2, code lost:
    
        if (r23 != 0) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01e4, code lost:
    
        if (r8 != false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x01e7, code lost:
    
        if (r8 == false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x01e9, code lost:
    
        r6 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01ec, code lost:
    
        r6 = -r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01ef, code lost:
    
        r27.d = r6;
        r27.b += r4;
        r27.c = 15;
        r6 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x01fd, code lost:
    
        r7 = 2;
        r9 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0200, code lost:
    
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0201, code lost:
    
        if (r9 == r7) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0204, code lost:
    
        if (r9 == 4) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0207, code lost:
    
        if (r9 != 7) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0209, code lost:
    
        r27.e = r4;
        r6 = 16;
        r27.c = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0243 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x025d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 749
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tml.b():int");
    }

    public final String g() {
        int i = this.k + 1;
        int i2 = this.b - this.l;
        return " at line " + i + INRGuObcrHjSQz.ePERo + (i2 + 1) + " path " + e();
    }
}
