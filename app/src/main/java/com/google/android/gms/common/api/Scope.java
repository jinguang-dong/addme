package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.hbs;
import defpackage.oix;
import defpackage.ojl;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class Scope extends oix implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new hbs(13);
    final int a;
    public final String b;

    public Scope(int i, String str) {
        ojl.ax(str, "scopeUri must not be null or empty");
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.b.equals(((Scope) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.A(parcel, 1, this.a);
        ojl.J(parcel, 2, this.b);
        ojl.w(parcel, iU);
    }

    public Scope(String str) {
        this(1, str);
    }
}
