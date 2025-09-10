package defpackage;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ohw extends oix {
    public static final Parcelable.Creator CREATOR = new azu(8);
    public static final Scope[] a = new Scope[0];
    public static final odl[] b = new odl[0];
    public final int c;
    public final int d;
    public final int e;
    public String f;
    public IBinder g;
    public Scope[] h;
    public Bundle i;
    public Account j;
    public odl[] k;
    public odl[] l;
    public boolean m;
    public int n;
    public boolean o;
    public String p;

    public ohw(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, odl[] odlVarArr, odl[] odlVarArr2, boolean z, int i4, boolean z2, String str2) {
        scopeArr = scopeArr == null ? a : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        odlVarArr = odlVarArr == null ? b : odlVarArr;
        odlVarArr2 = odlVarArr2 == null ? b : odlVarArr2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f = "com.google.android.gms";
        } else {
            this.f = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                oid oidVar = iInterfaceQueryLocalInterface instanceof oid ? (oid) iInterfaceQueryLocalInterface : new oid(iBinder);
                if (oidVar != null) {
                    long jClearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            Parcel parcelZ = oidVar.z(2, oidVar.a());
                            Account account3 = (Account) fbj.a(parcelZ, Account.CREATOR);
                            parcelZ.recycle();
                            Binder.restoreCallingIdentity(jClearCallingIdentity);
                            account2 = account3;
                        } catch (RemoteException unused) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                            Binder.restoreCallingIdentity(jClearCallingIdentity);
                        }
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        throw th;
                    }
                }
            }
            this.j = account2;
        } else {
            this.g = iBinder;
            this.j = account;
        }
        this.h = scopeArr;
        this.i = bundle;
        this.k = odlVarArr;
        this.l = odlVarArr2;
        this.m = z;
        this.n = i4;
        this.o = z2;
        this.p = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        azu.a(this, parcel, i);
    }
}
