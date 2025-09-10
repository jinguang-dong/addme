package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.a;
import defpackage.azu;
import defpackage.lpa;
import defpackage.odj;
import defpackage.ofc;
import defpackage.oix;
import defpackage.ojl;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class Status extends oix implements ReflectedParcelable, ofc {
    public final int e;
    public final String f;
    public final PendingIntent g;
    public final odj h;
    public static final Status a = new Status(0);
    public static final Status b = new Status(14);
    public static final Status c = new Status(15);
    public static final Status d = new Status(16);
    public static final Parcelable.Creator CREATOR = new azu(6);

    public Status(int i, String str, PendingIntent pendingIntent, odj odjVar) {
        this.e = i;
        this.f = str;
        this.g = pendingIntent;
        this.h = odjVar;
    }

    public final boolean b() {
        return this.e <= 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.e == status.e && a.K(this.f, status.f) && a.K(this.g, status.g) && a.K(this.h, status.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.e), this.f, this.g, this.h});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String strB = this.f;
        if (strB == null) {
            strB = lpa.B(this.e);
        }
        ojl.aC("statusCode", strB, arrayList);
        ojl.aC("resolution", this.g, arrayList);
        return ojl.aB(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.e;
        int iU = ojl.u(parcel);
        ojl.A(parcel, 1, i2);
        ojl.J(parcel, 2, this.f);
        ojl.I(parcel, 3, this.g, i);
        ojl.I(parcel, 4, this.h, i);
        ojl.w(parcel, iU);
    }

    public Status(int i) {
        this(i, null);
    }

    public Status(int i, String str) {
        this(i, str, null);
    }

    public Status(int i, String str, byte[] bArr) {
        this(i, str, null, null);
    }

    @Override // defpackage.ofc
    public final Status a() {
        return this;
    }
}
