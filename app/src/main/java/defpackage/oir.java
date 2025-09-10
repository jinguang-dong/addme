package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oir extends oix {
    public static final Parcelable.Creator CREATOR = new hbs(20);
    final int a;
    final IBinder b;
    public final odj c;
    public final boolean d;
    public final boolean e;

    public oir(int i, IBinder iBinder, odj odjVar, boolean z, boolean z2) {
        this.a = i;
        this.b = iBinder;
        this.c = odjVar;
        this.d = z;
        this.e = z2;
    }

    public final oid a() {
        IBinder iBinder = this.b;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        return iInterfaceQueryLocalInterface instanceof oid ? (oid) iInterfaceQueryLocalInterface : new oid(iBinder);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oir)) {
            return false;
        }
        oir oirVar = (oir) obj;
        return this.c.equals(oirVar.c) && a.K(a(), oirVar.a());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.A(parcel, 1, this.a);
        ojl.F(parcel, 2, this.b);
        ojl.I(parcel, 3, this.c, i);
        ojl.x(parcel, 4, this.d);
        ojl.x(parcel, 5, this.e);
        ojl.w(parcel, iU);
    }
}
