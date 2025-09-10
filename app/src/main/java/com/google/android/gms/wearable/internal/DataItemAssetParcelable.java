package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.oix;
import defpackage.ojl;
import defpackage.oks;
import defpackage.oqa;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class DataItemAssetParcelable extends oix implements ReflectedParcelable, oqa {
    public static final Parcelable.Creator CREATOR = new oks(16);
    public final String a;
    public final String b;

    public DataItemAssetParcelable(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.oqa
    public final String c() {
        return this.b;
    }

    @Override // defpackage.oqa
    public final String d() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataItemAssetParcelable[@");
        sb.append(Integer.toHexString(hashCode()));
        String str = this.a;
        if (str == null) {
            sb.append(",noid");
        } else {
            sb.append(",");
            sb.append(str);
        }
        sb.append(", key=");
        sb.append(this.b);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iU = ojl.u(parcel);
        ojl.J(parcel, 2, str);
        ojl.J(parcel, 3, this.b);
        ojl.w(parcel, iU);
    }

    public DataItemAssetParcelable(oqa oqaVar) {
        String strD = oqaVar.d();
        ojl.ay(strD);
        this.a = strD;
        String strC = oqaVar.c();
        ojl.ay(strC);
        this.b = strC;
    }
}
