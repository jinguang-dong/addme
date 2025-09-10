package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ohs extends oix {
    public static final Parcelable.Creator CREATOR = new hbs(17);
    public final oit a;
    public final boolean b;
    public final boolean c;
    public final int[] d;
    public final int e;
    public final int[] f;

    public ohs(oit oitVar, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.a = oitVar;
        this.b = z;
        this.c = z2;
        this.d = iArr;
        this.e = i;
        this.f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        oit oitVar = this.a;
        int iU = ojl.u(parcel);
        ojl.I(parcel, 1, oitVar, i);
        ojl.x(parcel, 2, this.b);
        ojl.x(parcel, 3, this.c);
        ojl.G(parcel, 4, this.d);
        ojl.A(parcel, 5, this.e);
        ojl.G(parcel, 6, this.f);
        ojl.w(parcel, iU);
    }
}
