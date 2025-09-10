package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tye extends tyf {
    public int c;
    public boolean e;
    public long g;
    public int h;
    public static final ArrayDeque a = new ArrayDeque();
    public static final Object b = new Object();
    public static final Parcelable.Creator CREATOR = new ouh(15);
    public tyj[] d = new tyj[16];
    public tyb f = new tyb();
    public final typ[] i = new typ[16];

    public tye() {
        for (int i = 0; i < 16; i++) {
            this.d[i] = new tyj();
            this.i[i] = new typ();
        }
        a();
    }

    @Override // defpackage.tyf
    public final void a() {
        super.a();
        this.c = 0;
        this.h = 0;
        this.e = false;
        this.g = 0L;
    }

    @Override // defpackage.tyf
    public final void b(Parcel parcel) {
        int iDataPosition = parcel.dataPosition() + parcel.readInt();
        super.b(parcel);
        if (parcel.dataPosition() < iDataPosition) {
            int i = parcel.readInt();
            this.c = i;
            f(i);
            for (int i2 = 0; i2 < this.c; i2++) {
                this.d[i2].a(parcel);
            }
        }
        if (parcel.dataPosition() < iDataPosition) {
            boolean z = parcel.readInt() != 0;
            this.e = z;
            if (z) {
                this.f.a(parcel);
            }
        }
        if (parcel.dataPosition() < iDataPosition) {
            this.g = parcel.readLong();
        }
        if (parcel.dataPosition() < iDataPosition) {
            int i3 = parcel.readInt();
            this.h = i3;
            f(i3);
            for (int i4 = 0; i4 < this.h; i4++) {
                this.i[i4].a(parcel);
            }
        }
        parcel.setDataPosition(iDataPosition);
    }

    @Override // defpackage.tyf
    public final void c() {
        a();
        synchronized (b) {
            ArrayDeque arrayDeque = a;
            if (!arrayDeque.contains(this)) {
                arrayDeque.add(this);
            }
        }
    }

    @Override // defpackage.tyf
    public final void d(int i) {
        super.d(i);
        e(i, this.c, this.d);
        this.f.e = i;
        e(i, this.h, this.i);
    }

    @Override // defpackage.tyf, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.tyf, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        int i2 = 24;
        for (int i3 = 0; i3 < this.l; i3++) {
            tya tyaVar = this.m[i3];
            i2 += 24;
        }
        for (int i4 = 0; i4 < this.n; i4++) {
            tyc tycVar = this.o[i4];
            i2 += 20;
        }
        for (int i5 = 0; i5 < this.p; i5++) {
            tyg tygVar = this.q[i5];
            i2 += 24;
        }
        for (int i6 = 0; i6 < this.r; i6++) {
            tyi tyiVar = this.s[i6];
            i2 += 28;
        }
        for (int i7 = 0; i7 < this.t; i7++) {
            tyn tynVar = this.u[i7];
            i2 += 28;
        }
        int i8 = i2 + 8;
        for (int i9 = 0; i9 < this.c; i9++) {
            tyj tyjVar = this.d[i9];
            i8 += 24;
        }
        int i10 = i8 + 4;
        if (this.e) {
            i10 = i8 + 24;
        }
        int i11 = i10 + 12;
        for (int i12 = 0; i12 < this.h; i12++) {
            typ typVar = this.i[i12];
            i11 += 20;
        }
        parcel.writeInt(i11);
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.c);
        for (int i13 = 0; i13 < this.c; i13++) {
            this.d[i13].writeToParcel(parcel, i);
        }
        parcel.writeInt(this.e ? 1 : 0);
        if (this.e) {
            this.f.writeToParcel(parcel, i);
        }
        parcel.writeLong(this.g);
        parcel.writeInt(this.h);
        for (int i14 = 0; i14 < this.h; i14++) {
            this.i[i14].writeToParcel(parcel, i);
        }
        if (parcel.dataPosition() - iDataPosition != i11) {
            throw new IllegalStateException("Parcelable implemented incorrectly, getByteSize() must return the correct size for each ControllerEvent subclass.");
        }
    }
}
