package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oiq extends oix {
    public static final Parcelable.Creator CREATOR = new hbs(19);
    final int a;
    public final Account b;
    public final int c;
    public final GoogleSignInAccount d;

    public oiq(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.a = i;
        this.b = account;
        this.c = i2;
        this.d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.A(parcel, 1, this.a);
        ojl.I(parcel, 2, this.b, i);
        ojl.A(parcel, 3, this.c);
        ojl.I(parcel, 4, this.d, i);
        ojl.w(parcel, iU);
    }
}
