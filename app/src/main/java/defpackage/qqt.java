package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.wear.ambient.AmbientDelegate;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qqt {
    public final Context a;
    public final String b;
    public final String c;
    public final String d;
    public final rww e;
    public final uem f;
    public final rwc g;
    public final rwc h;
    public final rwc i;
    public final uem j;
    public final int k;
    public final tql l;
    public final AmbientDelegate m;

    public qqt(Context context, rwc rwcVar, String str, uem uemVar, tql tqlVar, rwc rwcVar2, rwc rwcVar3, rwc rwcVar4, uem uemVar2) {
        this.a = context;
        this.f = uemVar;
        this.b = context.getPackageName();
        ActivityManager activityManager = qpm.a;
        this.c = qpm.c(context.getPackageName(), qpm.b());
        if (rwcVar.h()) {
        }
        this.d = str;
        PackageManager packageManager = context.getPackageManager();
        this.k = true == packageManager.hasSystemFeature("android.hardware.type.automotive") ? 5 : packageManager.hasSystemFeature("android.hardware.type.watch") ? 3 : packageManager.hasSystemFeature("android.software.leanback") ? 4 : 2;
        this.m = new AmbientDelegate(context);
        this.e = rnt.y(new nxi(this, 11));
        this.l = tqlVar;
        this.g = rwcVar2;
        this.h = rwcVar3;
        this.i = rwcVar4;
        this.j = uemVar2;
    }

    public static List a(List list, int i) {
        return list.size() > i ? list.subList(0, i) : list;
    }
}
