package defpackage;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tmm implements Closeable, Flushable {
    public static final Pattern a = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    private static final String[] e = new String[128];
    private static final String[] f;
    public final Writer b;
    public String c;
    public int d;
    private int[] g = new int[32];
    private int h = 0;
    private final tib i;
    private final String j;
    private String k;
    private final boolean l;

    static {
        for (int i = 0; i <= 31; i++) {
            e[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = e;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public tmm(Writer writer) {
        boolean z = false;
        i(6);
        this.d = 2;
        this.b = writer;
        tib tibVar = tib.a;
        tibVar.getClass();
        this.i = tibVar;
        this.k = ",";
        if (tibVar.d) {
            this.j = ": ";
            if (tibVar.b.isEmpty()) {
                this.k = ", ";
            }
        } else {
            this.j = ":";
        }
        if (tibVar.b.isEmpty() && tibVar.c.isEmpty()) {
            z = true;
        }
        this.l = z;
    }

    private final void h() throws IOException {
        if (this.l) {
            return;
        }
        Writer writer = this.b;
        tib tibVar = this.i;
        writer.write(tibVar.b);
        int i = this.h;
        for (int i2 = 1; i2 < i; i2++) {
            writer.write(tibVar.c);
        }
    }

    private final void i(int i) {
        int i2 = this.h;
        int[] iArr = this.g;
        if (i2 == iArr.length) {
            this.g = Arrays.copyOf(iArr, i2 + i2);
        }
        int[] iArr2 = this.g;
        int i3 = this.h;
        this.h = i3 + 1;
        iArr2[i3] = i;
    }

    private final void j(int i) {
        this.g[this.h - 1] = i;
    }

    public final int a() {
        int i = this.h;
        if (i != 0) {
            return this.g[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void b() throws IOException {
        int iA = a();
        if (iA == 1) {
            j(2);
            h();
            return;
        }
        if (iA == 2) {
            this.b.append((CharSequence) this.k);
            h();
        } else {
            if (iA == 4) {
                this.b.append((CharSequence) this.j);
                j(5);
                return;
            }
            if (iA != 6) {
                if (iA != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.d != 1) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            j(7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            java.io.Writer r8 = r8.b
            java.lang.String[] r0 = defpackage.tmm.e
            r1 = 34
            r8.write(r1)
            int r2 = r9.length()
            r3 = 0
            r4 = r3
        Lf:
            if (r3 >= r2) goto L39
            int r5 = r3 + 1
            char r6 = r9.charAt(r3)
            r7 = 128(0x80, float:1.8E-43)
            if (r6 >= r7) goto L20
            r6 = r0[r6]
            if (r6 == 0) goto L37
            goto L2d
        L20:
            r7 = 8232(0x2028, float:1.1535E-41)
            if (r6 != r7) goto L27
            java.lang.String r6 = "\\u2028"
            goto L2d
        L27:
            r7 = 8233(0x2029, float:1.1537E-41)
            if (r6 != r7) goto L37
            java.lang.String r6 = "\\u2029"
        L2d:
            if (r4 >= r3) goto L33
            int r3 = r3 - r4
            r8.write(r9, r4, r3)
        L33:
            r8.write(r6)
            r4 = r5
        L37:
            r3 = r5
            goto Lf
        L39:
            if (r4 >= r2) goto L3f
            int r2 = r2 - r4
            r8.write(r9, r4, r2)
        L3f:
            r8.write(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tmm.c(java.lang.String):void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.b.close();
        int i = this.h;
        if (i > 1 || (i == 1 && this.g[0] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.h = 0;
    }

    public final void d() throws IOException {
        if (this.c != null) {
            int iA = a();
            if (iA == 5) {
                this.b.write(this.k);
            } else if (iA != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            h();
            j(4);
            c(this.c);
            this.c = null;
        }
    }

    public final void e(int i, int i2, char c) throws IOException {
        int iA = a();
        if (iA != i2 && iA != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        String str = this.c;
        if (str != null) {
            throw new IllegalStateException("Dangling name: ".concat(str));
        }
        this.h--;
        if (iA == i2) {
            h();
        }
        this.b.write(c);
    }

    public final void f() throws IOException {
        if (this.c != null) {
            d();
        }
        b();
        this.b.write("null");
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        if (this.h == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.b.flush();
    }

    public final void g(int i, char c) throws IOException {
        b();
        i(i);
        this.b.write(c);
    }
}
