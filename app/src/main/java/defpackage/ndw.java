package defpackage;

import android.content.res.Resources;
import com.google.ar.core.R;
import j$.util.OptionalInt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ndw {
    private static final sbv J;
    private static final sbv K;
    public static boolean a = false;
    public static int b;
    public static int c;
    public static final sbv d;
    public final int A;
    public final ncn B;
    public final ltw C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final rwc n;
    public final rwc o;
    public final rwc p;
    public final rwc q;
    public final int r;
    public final OptionalInt s;
    public final String t;
    public final int u;
    public final boolean v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    static {
        sbr sbrVar = new sbr();
        sbrVar.f(ltw.THREE, Integer.valueOf(R.drawable.timer_3_on_shutter));
        sbrVar.f(ltw.FIVE, Integer.valueOf(R.drawable.timer_5_on_shutter));
        sbrVar.f(ltw.TEN, Integer.valueOf(R.drawable.timer_10_on_shutter));
        sbv sbvVarB = sbrVar.b();
        J = sbvVarB;
        sbr sbrVar2 = new sbr();
        sbrVar2.f(ltw.THREE, Integer.valueOf(R.drawable.timer_3_on_shutter_night));
        sbrVar2.f(ltw.FIVE, Integer.valueOf(R.drawable.timer_5_on_shutter_night));
        sbrVar2.f(ltw.TEN, Integer.valueOf(R.drawable.timer_10_on_shutter_night));
        sbv sbvVarB2 = sbrVar2.b();
        K = sbvVarB2;
        sbr sbrVar3 = new sbr();
        sbrVar3.f(ncn.PHOTO_IDLE, sbvVarB);
        sbrVar3.f(ncn.PORTRAIT_IDLE, sbvVarB);
        sbrVar3.f(ncn.CATSHARK_PHOTO_IDLE, sbvVarB);
        sbrVar3.f(ncn.CATSHARK_PORTRAIT_IDLE, sbvVarB);
        sbrVar3.f(ncn.NIGHT_IDLE, sbvVarB2);
        sbrVar3.f(ncn.ASTRO_IDLE, sbvVarB2);
        sbrVar3.f(ncn.LANDSCAPE_IDLE, sbvVarB);
        sbrVar3.f(ncn.ACTION_PAN_IDLE, sbvVarB);
        sbrVar3.f(ncn.SQUAD_IDLE, sbvVarB);
        d = sbrVar3.b();
    }

    public ndw() {
        throw null;
    }

    public static ndv a() {
        ndv ndvVar = new ndv((byte[]) null);
        ndvVar.c(false);
        ndvVar.v(0);
        ndvVar.e(0);
        ndvVar.d("none");
        ndvVar.m(0);
        ndvVar.n(-1);
        ndvVar.u(0);
        ndvVar.t(0);
        ndvVar.A(0);
        ndvVar.B(0);
        ndvVar.C(0);
        ndvVar.z(0);
        ndvVar.i(255);
        ndvVar.g();
        ndvVar.h(-1);
        ndvVar.j(0);
        return ndvVar;
    }

    public static ndv b(Resources resources) {
        ndv ndvVarA = a();
        ndvVarA.s(resources.getDimensionPixelSize(R.dimen.video_button_inner_radius));
        ndvVarA.n(resources.getColor(R.color.camera_main_button_color, null));
        ndvVarA.q(255);
        ndvVarA.r(resources.getColor(R.color.camera_mode_idle_color, null));
        ndvVarA.D(resources.getColor(R.color.camera_mode_idle_color, null));
        ndvVarA.E(0);
        ndvVarA.y(0);
        ndvVarA.w(resources.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
        ndvVarA.t(0);
        ndvVarA.u(0);
        ndvVarA.x(resources.getDimensionPixelSize(R.dimen.photo_button_radius));
        ndvVarA.p(resources.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
        return ndvVarA;
    }

    public static /* synthetic */ ndv c(Resources resources) {
        ndv ndvVarA = a();
        ndvVarA.s(resources.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
        ndvVarA.n(resources.getColor(R.color.camera_main_button_color, null));
        ndvVarA.q(255);
        ndvVarA.r(b);
        ndvVarA.E(0);
        ndvVarA.D(resources.getColor(R.color.video_mode_idle_color, null));
        ndvVarA.y(0);
        ndvVarA.c(true);
        ndvVarA.v(61);
        ndvVarA.w(resources.getDimensionPixelSize(R.dimen.photo_button_radius));
        ndvVarA.x(resources.getDimensionPixelSize(R.dimen.photo_button_radius));
        ndvVarA.p(resources.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
        ndvVarA.e(R.drawable.ic_brightness_pressed_24px);
        ndvVarA.m(resources.getDrawable(R.drawable.ic_brightness_pressed_24px, null).getIntrinsicWidth() / 2);
        return ndvVarA;
    }

    public static /* synthetic */ ndv d(Resources resources) {
        ndv ndvVarA = a();
        ndvVarA.s(resources.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
        ndvVarA.n(resources.getColor(R.color.camera_main_button_color, null));
        ndvVarA.q(255);
        ndvVarA.r(b);
        ndvVarA.E(0);
        ndvVarA.D(resources.getColor(R.color.video_mode_idle_color, null));
        ndvVarA.y(0);
        ndvVarA.v(61);
        ndvVarA.w(resources.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
        ndvVarA.x(resources.getDimensionPixelSize(R.dimen.photo_button_radius));
        ndvVarA.p(resources.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
        ndvVarA.i(61);
        ndvVarA.e(R.drawable.ic_brightness_pressed_24px);
        ndvVarA.m(resources.getDrawable(R.drawable.ic_brightness_pressed_24px, null).getIntrinsicWidth() / 2);
        return ndvVarA;
    }

    public static /* synthetic */ ndv e(Resources resources) {
        ndv ndvVarA = a();
        ndvVarA.s(resources.getDimensionPixelSize(R.dimen.photo_button_radius));
        ndvVarA.n(resources.getColor(R.color.camera_main_button_color, null));
        ndvVarA.q(0);
        ndvVarA.r(resources.getColor(R.color.camera_mode_idle_color, null));
        ndvVarA.D(resources.getColor(R.color.video_mode_idle_color, null));
        ndvVarA.E(resources.getDimensionPixelSize(R.dimen.photo_button_radius));
        ndvVarA.y(0);
        ndvVarA.w(resources.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
        ndvVarA.x(resources.getDimensionPixelSize(R.dimen.photo_button_radius));
        ndvVarA.p(resources.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
        ndvVarA.e(R.drawable.ic_center_pressed);
        ndvVarA.m(resources.getDrawable(R.drawable.ic_center_pressed, null).getIntrinsicWidth() / 2);
        return ndvVarA;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ndw) {
            ndw ndwVar = (ndw) obj;
            if (this.e == ndwVar.e && this.f == ndwVar.f && this.g == ndwVar.g && this.h == ndwVar.h && this.i == ndwVar.i && this.j == ndwVar.j && this.k == ndwVar.k && this.l == ndwVar.l && this.m == ndwVar.m && this.n.equals(ndwVar.n) && this.o.equals(ndwVar.o) && this.p.equals(ndwVar.p) && this.q.equals(ndwVar.q) && this.r == ndwVar.r && this.s.equals(ndwVar.s) && this.t.equals(ndwVar.t) && this.u == ndwVar.u && this.v == ndwVar.v && this.w == ndwVar.w && this.x == ndwVar.x && this.y == ndwVar.y && this.z == ndwVar.z && this.A == ndwVar.A && this.B.equals(ndwVar.B) && this.C.equals(ndwVar.C) && this.D == ndwVar.D && this.E == ndwVar.E && this.F == ndwVar.F && this.G == ndwVar.G && this.H == ndwVar.H && this.I == ndwVar.I) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.H ^ ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.e ^ 1000003) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003) ^ this.j) * 1000003) ^ this.k) * 1000003) ^ this.l) * 1000003) ^ this.m) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.p.hashCode()) * 1000003) ^ this.q.hashCode()) * 1000003) ^ this.r) * 1000003) ^ this.s.hashCode()) * 1000003) ^ this.t.hashCode()) * 1000003) ^ this.u) * 1000003) ^ (true != this.v ? 1237 : 1231)) * 1000003) ^ this.w) * 1000003) ^ this.x) * 1000003) ^ this.y) * 1000003) ^ this.z) * 1000003) ^ this.A) * 1000003) ^ this.B.hashCode()) * 1000003) ^ this.C.hashCode()) * 1000003) ^ this.D) * 1000003) ^ this.E) * 1000003) ^ this.F) * 1000003) ^ this.G) * 1000003)) * (-721379959)) ^ this.I;
    }

    public final String toString() {
        ltw ltwVar = this.C;
        ncn ncnVar = this.B;
        OptionalInt optionalInt = this.s;
        rwc rwcVar = this.q;
        rwc rwcVar2 = this.p;
        rwc rwcVar3 = this.o;
        String strValueOf = String.valueOf(this.n);
        String strValueOf2 = String.valueOf(rwcVar3);
        String strValueOf3 = String.valueOf(rwcVar2);
        String strValueOf4 = String.valueOf(rwcVar);
        String strValueOf5 = String.valueOf(optionalInt);
        String strValueOf6 = String.valueOf(ncnVar);
        String strValueOf7 = String.valueOf(ltwVar);
        StringBuilder sb = new StringBuilder("{");
        sb.append(this.e);
        sb.append(", ");
        sb.append(this.f);
        sb.append(", ");
        sb.append(this.g);
        sb.append(", ");
        sb.append(this.h);
        sb.append(", ");
        sb.append(this.i);
        sb.append(", ");
        sb.append(this.j);
        sb.append(", ");
        sb.append(this.k);
        sb.append(", ");
        sb.append(this.l);
        sb.append(", ");
        sb.append(this.m);
        sb.append(", ");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(strValueOf2);
        sb.append(", ");
        sb.append(strValueOf3);
        sb.append(", ");
        sb.append(strValueOf4);
        sb.append(", ");
        sb.append(this.r);
        sb.append(", ");
        sb.append(strValueOf5);
        sb.append(", ");
        sb.append(this.t);
        sb.append(", ");
        sb.append(this.u);
        sb.append(", ");
        sb.append(this.v);
        sb.append(", ");
        sb.append(this.w);
        sb.append(", ");
        sb.append(this.x);
        int i = this.I;
        int i2 = this.H;
        int i3 = this.G;
        int i4 = this.F;
        int i5 = this.E;
        int i6 = this.D;
        int i7 = this.A;
        int i8 = this.z;
        int i9 = this.y;
        sb.append(", ");
        sb.append(i9);
        sb.append(", ");
        sb.append(i8);
        sb.append(", ");
        sb.append(i7);
        sb.append(", ");
        sb.append(strValueOf6);
        sb.append(", ");
        sb.append(strValueOf7);
        sb.append(", ");
        sb.append(i6);
        sb.append(", ");
        sb.append(i5);
        sb.append(", ");
        sb.append(i4);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(i2);
        sb.append(", 0, ");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }

    public ndw(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, rwc rwcVar, rwc rwcVar2, rwc rwcVar3, rwc rwcVar4, int i10, OptionalInt optionalInt, String str, int i11, boolean z, int i12, int i13, int i14, int i15, int i16, ncn ncnVar, ltw ltwVar, int i17, int i18, int i19, int i20, int i21, int i22) {
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = i5;
        this.j = i6;
        this.k = i7;
        this.l = i8;
        this.m = i9;
        this.n = rwcVar;
        this.o = rwcVar2;
        this.p = rwcVar3;
        this.q = rwcVar4;
        this.r = i10;
        this.s = optionalInt;
        this.t = str;
        this.u = i11;
        this.v = z;
        this.w = i12;
        this.x = i13;
        this.y = i14;
        this.z = i15;
        this.A = i16;
        this.B = ncnVar;
        this.C = ltwVar;
        this.D = i17;
        this.E = i18;
        this.F = i19;
        this.G = i20;
        this.H = i21;
        this.I = i22;
    }
}
