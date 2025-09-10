package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class odz extends oix {
    public static final Parcelable.Creator CREATOR = new hbs(10);
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    private final Context g;

    public odz(String str, boolean z, boolean z2, IBinder iBinder, boolean z3, boolean z4, boolean z5) {
        ojr ojpVar;
        this.a = str;
        this.b = z;
        this.c = z2;
        if (iBinder == null) {
            ojpVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            ojpVar = iInterfaceQueryLocalInterface instanceof ojr ? (ojr) iInterfaceQueryLocalInterface : new ojp(iBinder);
        }
        this.g = (Context) ojq.b(ojpVar);
        this.d = z3;
        this.e = z4;
        this.f = z5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iU = ojl.u(parcel);
        ojl.J(parcel, 1, str);
        ojl.x(parcel, 2, this.b);
        ojl.x(parcel, 3, this.c);
        ojl.F(parcel, 4, new ojq(this.g));
        ojl.x(parcel, 5, this.d);
        ojl.x(parcel, 6, this.e);
        ojl.x(parcel, 8, this.f);
        ojl.w(parcel, iU);
    }
}
