package defpackage;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class okl extends oix {
    public static final Parcelable.Creator CREATOR = new okm();
    public String a;
    public Bundle b;
    public String c;
    public final ApplicationErrorReport d;
    public String e;
    public BitmapTeleporter f;
    public final String g;
    public List h;
    public boolean i;
    public okt j;
    public oko k;
    public boolean l;
    public Bitmap m;
    public String n;
    public boolean o;
    public long p;
    public boolean q;
    public String r;
    public okf s;

    public okl(String str, Bundle bundle, String str2, ApplicationErrorReport applicationErrorReport, String str3, BitmapTeleporter bitmapTeleporter, String str4, List list, boolean z, okt oktVar, oko okoVar, boolean z2, Bitmap bitmap, String str5, boolean z3, long j, boolean z4, String str6, okf okfVar) {
        this.a = str;
        this.b = bundle == null ? new Bundle() : bundle;
        this.c = str2;
        this.d = applicationErrorReport == null ? new ApplicationErrorReport() : applicationErrorReport;
        this.e = str3;
        this.f = bitmapTeleporter;
        this.g = str4;
        this.h = list == null ? new ArrayList() : list;
        this.i = z;
        this.j = oktVar;
        this.k = okoVar;
        this.l = z2;
        this.m = bitmap;
        this.n = str5;
        this.o = z3;
        this.p = j;
        this.q = z4;
        this.r = str6;
        this.s = okfVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        okm.a(this, parcel, i);
    }
}
