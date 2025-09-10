package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.oix;
import defpackage.ojl;
import defpackage.okf;
import defpackage.okg;
import defpackage.okl;
import defpackage.okn;
import defpackage.oko;
import defpackage.okp;
import defpackage.okt;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ErrorReport extends oix implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new okg(2);
    public String A;
    public String B;
    public String C;
    public Bundle D;
    public boolean E;
    public int F;
    public int G;
    public boolean H;
    public String I;
    public String J;
    public int K;
    public String L;
    public String M;
    public String N;
    public String O;
    public String P;

    @Deprecated
    public String Q;
    public String R;
    public BitmapTeleporter S;
    public String T;
    public okn[] U;
    public String[] V;
    public boolean W;
    public String X;
    public okt Y;
    public oko Z;
    public ApplicationErrorReport a;

    @Deprecated
    public String aa;
    public boolean ab;
    public Bundle ac;
    public List ad;
    public boolean ae;
    public Bitmap af;
    public String ag;
    public List ah;
    public int ai;
    public int aj;
    public String[] ak;
    public String[] al;
    public String[] am;
    public boolean an;
    public boolean ao;
    public String ap;
    public okf aq;
    public okp[] ar;
    public String b;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public int k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String[] q;
    public String[] r;
    public String[] s;
    public String t;
    public String u;
    public byte[] v;
    public int w;
    public int x;
    public int y;
    public int z;

    public ErrorReport() {
        this.a = new ApplicationErrorReport();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.I(parcel, 2, this.a, i);
        ojl.J(parcel, 3, this.b);
        ojl.A(parcel, 4, this.c);
        ojl.J(parcel, 5, this.d);
        ojl.J(parcel, 6, this.e);
        ojl.J(parcel, 7, this.f);
        ojl.J(parcel, 8, this.g);
        ojl.J(parcel, 9, this.h);
        ojl.J(parcel, 10, this.i);
        ojl.J(parcel, 11, this.j);
        ojl.A(parcel, 12, this.k);
        ojl.J(parcel, 13, this.l);
        ojl.J(parcel, 14, this.m);
        ojl.J(parcel, 15, this.n);
        ojl.J(parcel, 16, this.o);
        ojl.J(parcel, 17, this.p);
        ojl.K(parcel, 18, this.q);
        ojl.K(parcel, 19, this.r);
        ojl.K(parcel, 20, this.s);
        ojl.J(parcel, 21, this.t);
        ojl.J(parcel, 22, this.u);
        ojl.D(parcel, 23, this.v);
        ojl.A(parcel, 24, this.w);
        ojl.A(parcel, 25, this.x);
        ojl.A(parcel, 26, this.y);
        ojl.A(parcel, 27, this.z);
        ojl.J(parcel, 28, this.A);
        ojl.J(parcel, 29, this.B);
        ojl.J(parcel, 30, this.C);
        ojl.C(parcel, 31, this.D);
        ojl.x(parcel, 32, this.E);
        ojl.A(parcel, 33, this.F);
        ojl.A(parcel, 34, this.G);
        ojl.x(parcel, 35, this.H);
        ojl.J(parcel, 36, this.I);
        ojl.J(parcel, 37, this.J);
        ojl.A(parcel, 38, this.K);
        ojl.J(parcel, 39, this.L);
        ojl.J(parcel, 40, this.M);
        ojl.J(parcel, 41, this.N);
        ojl.J(parcel, 42, this.O);
        ojl.J(parcel, 43, this.P);
        ojl.J(parcel, 44, this.Q);
        ojl.J(parcel, 45, this.R);
        ojl.I(parcel, 46, this.S, i);
        ojl.J(parcel, 47, this.T);
        ojl.M(parcel, 48, this.U, i);
        ojl.K(parcel, 49, this.V);
        ojl.x(parcel, 50, this.W);
        ojl.J(parcel, 51, this.X);
        ojl.I(parcel, 52, this.Y, i);
        ojl.I(parcel, 53, this.Z, i);
        ojl.J(parcel, 54, this.aa);
        ojl.x(parcel, 55, this.ab);
        ojl.C(parcel, 56, this.ac);
        ojl.N(parcel, 57, this.ad);
        ojl.x(parcel, 58, this.ae);
        ojl.I(parcel, 59, this.af, i);
        ojl.J(parcel, 60, this.ag);
        ojl.L(parcel, 61, this.ah);
        ojl.A(parcel, 62, this.ai);
        ojl.A(parcel, 63, this.aj);
        ojl.K(parcel, 64, this.ak);
        ojl.K(parcel, 65, this.al);
        ojl.K(parcel, 66, this.am);
        ojl.x(parcel, 67, this.an);
        ojl.x(parcel, 68, this.ao);
        ojl.J(parcel, 69, this.ap);
        ojl.I(parcel, 70, this.aq, i);
        ojl.M(parcel, 71, this.ar, i);
        ojl.w(parcel, iU);
    }

    public ErrorReport(ApplicationErrorReport applicationErrorReport, String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, String str9, String str10, String str11, String str12, String str13, String[] strArr, String[] strArr2, String[] strArr3, String str14, String str15, byte[] bArr, int i3, int i4, int i5, int i6, String str16, String str17, String str18, Bundle bundle, boolean z, int i7, int i8, boolean z2, String str19, String str20, int i9, String str21, String str22, String str23, String str24, String str25, String str26, String str27, BitmapTeleporter bitmapTeleporter, String str28, okn[] oknVarArr, String[] strArr4, boolean z3, String str29, okt oktVar, oko okoVar, String str30, boolean z4, Bundle bundle2, List list, boolean z5, Bitmap bitmap, String str31, List list2, int i10, int i11, String[] strArr5, String[] strArr6, String[] strArr7, boolean z6, boolean z7, String str32, okf okfVar, okp[] okpVarArr) {
        new ApplicationErrorReport();
        this.a = applicationErrorReport;
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = i2;
        this.l = str9;
        this.m = str10;
        this.n = str11;
        this.o = str12;
        this.p = str13;
        this.q = strArr;
        this.r = strArr2;
        this.s = strArr3;
        this.t = str14;
        this.u = str15;
        this.v = bArr;
        this.w = i3;
        this.x = i4;
        this.y = i5;
        this.z = i6;
        this.A = str16;
        this.B = str17;
        this.C = str18;
        this.D = bundle;
        this.E = z;
        this.F = i7;
        this.G = i8;
        this.H = z2;
        this.I = str19;
        this.J = str20;
        this.K = i9;
        this.L = str21;
        this.M = str22;
        this.N = str23;
        this.O = str24;
        this.P = str25;
        this.Q = str26;
        this.R = str27;
        this.S = bitmapTeleporter;
        this.T = str28;
        this.U = oknVarArr;
        this.V = strArr4;
        this.W = z3;
        this.X = str29;
        this.Y = oktVar;
        this.Z = okoVar;
        this.aa = str30;
        this.ab = z4;
        this.ac = bundle2;
        this.ad = list;
        this.ae = z5;
        this.af = bitmap;
        this.ag = str31;
        this.ah = list2;
        this.ai = i10;
        this.aj = i11;
        this.ak = strArr5;
        this.al = strArr6;
        this.am = strArr7;
        this.an = z6;
        this.ao = z7;
        this.ap = str32;
        this.aq = okfVar;
        this.ar = okpVarArr;
    }

    public ErrorReport(okl oklVar, File file) {
        this.a = new ApplicationErrorReport();
        Bundle bundle = oklVar.b;
        if (bundle != null && !bundle.isEmpty()) {
            this.D = oklVar.b;
        }
        if (!TextUtils.isEmpty(oklVar.a)) {
            this.B = oklVar.a;
        }
        if (!TextUtils.isEmpty(oklVar.c)) {
            this.b = oklVar.c;
        }
        ApplicationErrorReport.CrashInfo crashInfo = oklVar.d.crashInfo;
        if (crashInfo != null) {
            this.M = crashInfo.throwMethodName;
            this.K = crashInfo.throwLineNumber;
            this.L = crashInfo.throwClassName;
            this.N = crashInfo.stackTrace;
            this.I = crashInfo.exceptionClassName;
            this.O = crashInfo.exceptionMessage;
            this.J = crashInfo.throwFileName;
        }
        okt oktVar = oklVar.j;
        if (oktVar != null) {
            this.Y = oktVar;
        }
        if (!TextUtils.isEmpty(oklVar.e)) {
            this.P = oklVar.e;
        }
        String str = oklVar.g;
        if (!TextUtils.isEmpty(str)) {
            this.a.packageName = str;
        }
        if (!TextUtils.isEmpty(oklVar.n)) {
            this.ag = oklVar.n;
        }
        Bitmap bitmap = oklVar.m;
        if (bitmap != null) {
            this.af = bitmap;
        }
        if (file != null) {
            this.S = oklVar.f;
            List list = oklVar.h;
            if (list != null && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((okn) it.next()).d = file;
                }
                this.U = (okn[]) list.toArray(new okn[0]);
            }
        }
        oko okoVar = oklVar.k;
        if (okoVar != null) {
            this.Z = okoVar;
        }
        this.W = oklVar.i;
        this.ae = oklVar.l;
        this.E = oklVar.o;
        this.an = oklVar.q;
        this.ap = oklVar.r;
        this.aq = oklVar.s;
    }
}
