package com.google.android.gms.googlehelp;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import defpackage.oix;
import defpackage.ojl;
import defpackage.okt;
import defpackage.okx;
import defpackage.oli;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GoogleHelp extends oix implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new okx();
    boolean A;
    boolean B;
    int C;
    String D;
    boolean E;
    String F;
    boolean G;
    ND4CSettings H;
    boolean I;
    List J;

    @Deprecated
    String K;
    public int L;
    public int M;
    public List N;
    String O;
    Intent P;
    List Q;
    final int a;
    String b;
    Account c;
    Bundle d;
    String e;
    String f;
    Bitmap g;
    boolean h;
    boolean i;
    List j;

    @Deprecated
    Bundle k;

    @Deprecated
    Bitmap l;

    @Deprecated
    byte[] m;

    @Deprecated
    int n;

    @Deprecated
    int o;
    String p;
    public Uri q;
    List r;
    okt s;
    List t;
    boolean u;
    ErrorReport v;
    public TogglingData w;
    int x;
    PendingIntent y;
    public int z;

    public GoogleHelp(int i, String str, Account account, Bundle bundle, String str2, String str3, Bitmap bitmap, boolean z, boolean z2, List list, Bundle bundle2, Bitmap bitmap2, byte[] bArr, int i2, int i3, String str4, Uri uri, List list2, int i4, okt oktVar, List list3, boolean z3, ErrorReport errorReport, TogglingData togglingData, int i5, PendingIntent pendingIntent, int i6, boolean z4, boolean z5, int i7, String str5, boolean z6, String str6, boolean z7, ND4CSettings nD4CSettings, boolean z8, List list4, String str7, int i8, int i9, List list5, String str8, Intent intent, List list6) {
        this.v = new ErrorReport();
        if (TextUtils.isEmpty(str)) {
            throw new IllegalStateException("Help requires a non-empty appContext");
        }
        this.a = i;
        this.z = i6;
        this.A = z4;
        this.B = z5;
        this.C = i7;
        this.D = str5;
        this.b = str;
        this.c = account;
        this.d = bundle;
        this.e = str2;
        this.f = str3;
        this.g = bitmap;
        this.h = z;
        this.i = z2;
        this.E = z6;
        this.j = list;
        this.y = pendingIntent;
        this.k = bundle2;
        this.l = bitmap2;
        this.m = bArr;
        this.n = i2;
        this.o = i3;
        this.p = str4;
        this.q = uri;
        this.r = list2;
        if (i < 4) {
            okt oktVar2 = new okt();
            oktVar2.a = i4;
            this.s = oktVar2;
        } else {
            this.s = oktVar == null ? new okt() : oktVar;
        }
        this.t = list3;
        this.u = z3;
        this.v = errorReport;
        if (errorReport != null) {
            errorReport.X = "GoogleHelp";
        }
        this.w = togglingData;
        this.x = i5;
        this.F = str6;
        this.G = z7;
        this.H = nD4CSettings;
        this.I = z8;
        this.J = list4;
        this.K = str7;
        this.L = i8;
        this.M = i9;
        this.N = list5;
        this.O = str8;
        this.P = intent;
        this.Q = list6;
    }

    public final void a(int i, String str, Intent intent) {
        this.r.add(new oli(i, str, intent));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.A(parcel, 1, this.a);
        ojl.J(parcel, 2, this.b);
        ojl.I(parcel, 3, this.c, i);
        ojl.C(parcel, 4, this.d);
        ojl.x(parcel, 5, this.h);
        ojl.x(parcel, 6, this.i);
        ojl.L(parcel, 7, this.j);
        ojl.C(parcel, 10, this.k);
        ojl.I(parcel, 11, this.l, i);
        ojl.J(parcel, 14, this.p);
        ojl.I(parcel, 15, this.q, i);
        ojl.N(parcel, 16, this.r);
        ojl.A(parcel, 17, 0);
        ojl.N(parcel, 18, this.t);
        ojl.D(parcel, 19, this.m);
        ojl.A(parcel, 20, this.n);
        ojl.A(parcel, 21, this.o);
        ojl.x(parcel, 22, this.u);
        ojl.I(parcel, 23, this.v, i);
        ojl.I(parcel, 25, this.s, i);
        ojl.J(parcel, 28, this.e);
        ojl.I(parcel, 31, this.w, i);
        ojl.A(parcel, 32, this.x);
        ojl.I(parcel, 33, this.y, i);
        ojl.J(parcel, 34, this.f);
        ojl.I(parcel, 35, this.g, i);
        ojl.A(parcel, 36, this.z);
        ojl.x(parcel, 37, this.A);
        ojl.x(parcel, 38, this.B);
        ojl.A(parcel, 39, this.C);
        ojl.J(parcel, 40, this.D);
        ojl.x(parcel, 41, this.E);
        ojl.J(parcel, 42, this.F);
        ojl.x(parcel, 43, this.G);
        ojl.I(parcel, 44, this.H, i);
        ojl.x(parcel, 45, this.I);
        ojl.N(parcel, 46, this.J);
        ojl.J(parcel, 47, this.K);
        ojl.A(parcel, 48, this.L);
        ojl.A(parcel, 49, this.M);
        ojl.N(parcel, 50, this.N);
        ojl.J(parcel, 51, this.O);
        ojl.I(parcel, 52, this.P, i);
        ojl.L(parcel, 53, this.Q);
        ojl.w(parcel, iU);
    }
}
