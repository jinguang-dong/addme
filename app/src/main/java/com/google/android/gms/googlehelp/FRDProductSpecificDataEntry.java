package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.a;
import defpackage.oix;
import defpackage.ojl;
import defpackage.okg;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FRDProductSpecificDataEntry extends oix implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new okg(6);
    final int a;
    final int b;
    final List c;
    final List d;
    final List e;
    final List f;
    final byte[][] g;
    final Boolean h;

    public FRDProductSpecificDataEntry(int i, int i2, List list, List list2, List list3, List list4, byte[][] bArr, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = list;
        this.d = list2;
        this.e = list3;
        this.f = list4;
        this.g = bArr;
        this.h = Boolean.valueOf(z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FRDProductSpecificDataEntry)) {
            return false;
        }
        FRDProductSpecificDataEntry fRDProductSpecificDataEntry = (FRDProductSpecificDataEntry) obj;
        return this.a == fRDProductSpecificDataEntry.a && this.b == fRDProductSpecificDataEntry.b && a.K(this.c, fRDProductSpecificDataEntry.c) && a.K(this.d, fRDProductSpecificDataEntry.d) && a.K(this.e, fRDProductSpecificDataEntry.e) && a.K(this.f, fRDProductSpecificDataEntry.f) && Arrays.equals(this.g, fRDProductSpecificDataEntry.g) && a.K(this.h, fRDProductSpecificDataEntry.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d, this.e, this.f, Integer.valueOf(Arrays.deepHashCode(this.g)), this.h});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.A(parcel, 2, this.a);
        ojl.A(parcel, 3, this.b);
        ojl.L(parcel, 4, this.c);
        ojl.H(parcel, 5, this.d);
        ojl.L(parcel, 6, this.e);
        ojl.H(parcel, 7, this.f);
        ojl.E(parcel, 8, this.g);
        ojl.z(parcel, 9, 4);
        parcel.writeInt(this.h.booleanValue() ? 1 : 0);
        ojl.w(parcel, iU);
    }
}
