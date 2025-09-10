package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import defpackage.a;
import defpackage.hbs;
import defpackage.oix;
import defpackage.ojl;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DataHolder extends oix implements Closeable {
    public static final Parcelable.Creator CREATOR = new hbs(15);
    final int a;
    public final String[] b;
    public Bundle c;
    public final CursorWindow[] d;
    public final int e;
    public final Bundle f;
    public int[] g;
    public int h;
    boolean i = false;
    private final boolean j = true;

    static {
        new ArrayList();
        new HashMap();
    }

    public DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.a = i;
        this.b = strArr;
        this.d = cursorWindowArr;
        this.e = i2;
        this.f = bundle;
    }

    public final int a(int i) {
        int length;
        int i2 = 0;
        ojl.au(i >= 0 && i < this.h);
        while (true) {
            int[] iArr = this.g;
            length = iArr.length;
            if (i2 >= length) {
                break;
            }
            if (i < iArr[i2]) {
                i2--;
                break;
            }
            i2++;
        }
        return i2 == length ? i2 - 1 : i2;
    }

    public final String b(String str, int i, int i2) {
        c(str, i);
        return this.d[i2].getString(i, this.c.getInt(str));
    }

    public final void c(String str, int i) {
        Bundle bundle = this.c;
        if (bundle == null || !bundle.containsKey(str)) {
            throw new IllegalArgumentException("No such column: ".concat(str));
        }
        if (d()) {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (i < 0 || i >= this.h) {
            throw new CursorIndexOutOfBoundsException(i, this.h);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (!this.i) {
                this.i = true;
                int i = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.d;
                    if (i >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i].close();
                    i++;
                }
            }
        }
    }

    public final boolean d() {
        boolean z;
        synchronized (this) {
            z = this.i;
        }
        return z;
    }

    protected final void finalize() throws Throwable {
        try {
            if (this.j && this.d.length > 0 && !d()) {
                close();
                Log.e("DataBuffer", a.bx(this, "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ", ")"));
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String[] strArr = this.b;
        int iU = ojl.u(parcel);
        ojl.K(parcel, 1, strArr);
        ojl.M(parcel, 2, this.d, i);
        ojl.A(parcel, 3, this.e);
        ojl.C(parcel, 4, this.f);
        ojl.A(parcel, 1000, this.a);
        ojl.w(parcel, iU);
        if ((i & 1) != 0) {
            close();
        }
    }
}
