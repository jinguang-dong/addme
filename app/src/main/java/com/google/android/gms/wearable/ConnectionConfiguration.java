package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.camera.coach.YOHg.INRGuObcrHjSQz;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.a;
import defpackage.oix;
import defpackage.ojl;
import defpackage.opx;
import defpackage.opy;
import defpackage.opz;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ConnectionConfiguration extends oix implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new opx();
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public volatile String g;
    public final boolean h;
    public final String i;
    public final String j;
    public final int k;
    public final List l;
    public final boolean m;
    public final boolean n;
    public final opz o;
    public final boolean p;
    public final opy q;
    public final int r;
    public final int s;

    public ConnectionConfiguration(String str, String str2, int i, int i2, boolean z, boolean z2, String str3, boolean z3, String str4, String str5, int i3, List list, boolean z4, boolean z5, opz opzVar, boolean z6, opy opyVar, int i4, int i5) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = z2;
        this.g = str3;
        this.h = z3;
        this.i = str4;
        this.j = str5;
        this.k = i3;
        this.l = list;
        this.m = z4;
        this.n = z5;
        this.o = opzVar;
        this.p = z6;
        this.q = opyVar;
        this.r = i4;
        this.s = i5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ConnectionConfiguration)) {
            return false;
        }
        ConnectionConfiguration connectionConfiguration = (ConnectionConfiguration) obj;
        return a.K(this.a, connectionConfiguration.a) && a.K(this.b, connectionConfiguration.b) && a.K(Integer.valueOf(this.c), Integer.valueOf(connectionConfiguration.c)) && a.K(Integer.valueOf(this.d), Integer.valueOf(connectionConfiguration.d)) && a.K(Boolean.valueOf(this.e), Boolean.valueOf(connectionConfiguration.e)) && a.K(Boolean.valueOf(this.h), Boolean.valueOf(connectionConfiguration.h)) && a.K(Boolean.valueOf(this.m), Boolean.valueOf(connectionConfiguration.m)) && a.K(Boolean.valueOf(this.n), Boolean.valueOf(connectionConfiguration.n));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d), Boolean.valueOf(this.e), Boolean.valueOf(this.h), Boolean.valueOf(this.m), Boolean.valueOf(this.n)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.J(parcel, 2, this.a);
        ojl.J(parcel, 3, this.b);
        ojl.A(parcel, 4, this.c);
        ojl.A(parcel, 5, this.d);
        ojl.x(parcel, 6, this.e);
        ojl.x(parcel, 7, this.f);
        ojl.J(parcel, 8, this.g);
        ojl.x(parcel, 9, this.h);
        ojl.J(parcel, 10, this.i);
        ojl.J(parcel, 11, this.j);
        ojl.A(parcel, 12, this.k);
        ojl.L(parcel, 13, this.l);
        ojl.x(parcel, 14, this.m);
        ojl.x(parcel, 15, this.n);
        ojl.I(parcel, 16, this.o, i);
        ojl.x(parcel, 17, this.p);
        ojl.I(parcel, 18, this.q, i);
        ojl.A(parcel, 19, this.r);
        ojl.A(parcel, 20, this.s);
        ojl.w(parcel, iU);
    }

    public final String toString() {
        return "ConnectionConfiguration[ Name=" + this.a + ", Address=" + this.b + ", Type=" + this.c + ", Role=" + this.d + ", Enabled=" + this.e + ", IsConnected=" + this.f + ", PeerNodeId=" + this.g + ", BtlePriority=" + this.h + ", NodeId=" + this.i + ", PackageName=" + this.j + ", ConnectionRetryStrategy=" + this.k + ", allowedConfigPackages=" + this.l + ", Migrating=" + this.m + ", DataItemSyncEnabled=" + this.n + ", ConnectionRestrictions=" + this.o + ", removeConnectionWhenBondRemovedByUser=" + this.p + INRGuObcrHjSQz.uyIRbcBaqqNCm + this.r + ", runtimeType=" + this.s + "]";
    }
}
