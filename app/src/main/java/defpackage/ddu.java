package defpackage;

import android.database.Cursor;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ddu extends ddw {
    public int[] a;
    public long[] b;
    public double[] c;
    public String[] d;
    public byte[][] e;
    private Cursor i;

    public ddu(dfa dfaVar, String str) {
        super(dfaVar, str);
        this.a = new int[0];
        this.b = new long[0];
        this.c = new double[0];
        this.d = new String[0];
        this.e = new byte[0][];
    }

    private final Cursor n() {
        Cursor cursor = this.i;
        if (cursor != null) {
            return cursor;
        }
        cog.q(21, "no row");
        throw new uer();
    }

    private final void o(int i, int i2) {
        int[] iArr = this.a;
        int i3 = i2 + 1;
        if (iArr.length < i3) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i3);
            iArrCopyOf.getClass();
            this.a = iArrCopyOf;
        }
        if (i == 1) {
            long[] jArr = this.b;
            if (jArr.length < i3) {
                long[] jArrCopyOf = Arrays.copyOf(jArr, i3);
                jArrCopyOf.getClass();
                this.b = jArrCopyOf;
                return;
            }
            return;
        }
        if (i == 2) {
            double[] dArr = this.c;
            if (dArr.length < i3) {
                double[] dArrCopyOf = Arrays.copyOf(dArr, i3);
                dArrCopyOf.getClass();
                this.c = dArrCopyOf;
                return;
            }
            return;
        }
        if (i == 3) {
            String[] strArr = this.d;
            if (strArr.length < i3) {
                Object[] objArrCopyOf = Arrays.copyOf(strArr, i3);
                objArrCopyOf.getClass();
                this.d = (String[]) objArrCopyOf;
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        byte[][] bArr = this.e;
        if (bArr.length < i3) {
            Object[] objArrCopyOf2 = Arrays.copyOf(bArr, i3);
            objArrCopyOf2.getClass();
            this.e = (byte[][]) objArrCopyOf2;
        }
    }

    private final void p() {
        if (this.i == null) {
            this.i = this.f.a(new ddt(this));
        }
    }

    private static final void q(Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            cog.q(25, "column index out of range");
            throw new uer();
        }
    }

    @Override // defpackage.dey
    public final int a() {
        k();
        p();
        Cursor cursor = this.i;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // defpackage.dey
    public final long b(int i) {
        k();
        Cursor cursorN = n();
        q(cursorN, i);
        return cursorN.getLong(i);
    }

    @Override // defpackage.dey
    public final String c(int i) {
        k();
        p();
        Cursor cursor = this.i;
        if (cursor == null) {
            throw new IllegalStateException("Required value was null.");
        }
        q(cursor, i);
        String columnName = cursor.getColumnName(i);
        columnName.getClass();
        return columnName;
    }

    @Override // defpackage.dey, java.lang.AutoCloseable
    public final void close() {
        if (!this.h) {
            k();
            this.a = new int[0];
            this.b = new long[0];
            this.c = new double[0];
            this.d = new String[0];
            this.e = new byte[0][];
            h();
        }
        m();
    }

    @Override // defpackage.dey
    public final String d(int i) {
        k();
        Cursor cursorN = n();
        q(cursorN, i);
        String string = cursorN.getString(i);
        string.getClass();
        return string;
    }

    @Override // defpackage.dey
    public final void e(int i, long j) {
        k();
        o(1, i);
        this.a[i] = 1;
        this.b[i] = j;
    }

    @Override // defpackage.dey
    public final void f(int i) {
        k();
        o(5, i);
        this.a[i] = 5;
    }

    @Override // defpackage.dey
    public final void g(int i, String str) {
        k();
        o(3, i);
        this.a[i] = 3;
        this.d[i] = str;
    }

    @Override // defpackage.dey
    public final void h() {
        k();
        Cursor cursor = this.i;
        if (cursor != null) {
            cursor.close();
        }
        this.i = null;
    }

    @Override // defpackage.dey
    public final boolean i(int i) {
        k();
        Cursor cursorN = n();
        q(cursorN, i);
        return cursorN.isNull(i);
    }

    @Override // defpackage.dey
    public final boolean j() {
        k();
        p();
        Cursor cursor = this.i;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        throw new IllegalStateException("Required value was null.");
    }
}
