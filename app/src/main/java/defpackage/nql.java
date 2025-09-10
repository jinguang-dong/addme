package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nql {
    static final float a = nlj.b(80.0f);
    public static boolean b = false;
    public final GestureDetector c;
    public final ScaleGestureDetector d;
    public final nqf e;
    public final nqh f;
    public final ryq g;
    public final owf h;
    public final View i;
    public boolean j;
    public boolean k;
    public float l;
    public float m;
    public int n;
    public final itk o;
    public int p;
    public final nkf q;
    public final nkg r;
    public final hbj s;
    public final noy t;
    public final rnu u;
    private final GestureDetector.OnGestureListener v;

    public nql(nki nkiVar, nkf nkfVar, nkg nkgVar, nqf nqfVar, nqh nqhVar, ScaleGestureDetector.OnScaleGestureListener onScaleGestureListener, noy noyVar, rnu rnuVar, owf owfVar, View view, Context context, hbj hbjVar) {
        ScaleGestureDetector scaleGestureDetector;
        nqj nqjVar = new nqj(this);
        this.v = nqjVar;
        this.o = new nqk(this);
        this.c = new GestureDetector((Context) nkiVar.a, nqjVar, (Handler) nkiVar.b);
        nqi nqiVar = new nqi(this, onScaleGestureListener, nqfVar, hbjVar);
        if (((hbj) nkiVar.c).p(hba.y)) {
            scaleGestureDetector = new nnf((Context) nkiVar.a, nqiVar, (Handler) nkiVar.b);
        } else {
            scaleGestureDetector = new ScaleGestureDetector((Context) nkiVar.a, nqiVar, (Handler) nkiVar.b);
        }
        this.d = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(false);
        this.q = nkfVar;
        this.r = nkgVar;
        nqfVar.getClass();
        this.e = nqfVar;
        this.f = nqhVar;
        this.t = noyVar;
        this.u = rnuVar;
        this.p = 1;
        this.g = sbc.b(nqc.ZOOM, context.getResources().getString(R.string.preference_double_tap_zoom), nqc.SWITCH_CAMERA, context.getResources().getString(R.string.preference_double_tap_switch_camera), nqc.NONE, context.getResources().getString(R.string.preference_double_tap_none));
        this.s = hbjVar;
        this.h = owfVar;
        this.i = view;
    }

    public static void b() {
        b = false;
    }

    public static void c() {
        b = true;
    }

    public static boolean d(float f) {
        return Math.abs(f) > a;
    }

    public final nqe a() {
        int i = this.p;
        int i2 = i - 1;
        if (i != 0) {
            return i2 != 1 ? i2 != 2 ? nqe.y : this.r : this.q;
        }
        throw null;
    }
}
