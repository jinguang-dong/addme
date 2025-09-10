package defpackage;

import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nqj extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ nql a;

    public nqj(nql nqlVar) {
        this.a = nqlVar;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, utj] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Iterable, java.lang.Object] */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        gvk gvkVar;
        Float fValueOf;
        nql nqlVar = this.a;
        nqlVar.f.b();
        nqc nqcVar = (nqc) ((sew) nqlVar.g).c.get(((ovx) nqlVar.h).d);
        if (nqcVar != null) {
            hbj hbjVar = nqlVar.s;
            if (hbjVar.p(gzo.bl) || hbjVar.p(haa.v)) {
                if (nqcVar == nqc.SWITCH_CAMERA && !nql.b) {
                    return true;
                }
                noy noyVar = nqlVar.t;
                new PointF(motionEvent.getX(), motionEvent.getY());
                int iOrdinal = nqcVar.ordinal();
                if (iOrdinal == 0) {
                    qwz qwzVar = (qwz) noyVar.b;
                    if (qwzVar.b) {
                        Iterator it = qwzVar.d.iterator();
                        while (it.hasNext()) {
                            gwv gwvVar = (gwv) ((rnu) it.next()).a;
                            rwc rwcVar = gwvVar.l;
                            if (rwcVar.h() && (gvkVar = (gvk) gwvVar.S.h.c()) != null) {
                                if (!gwvVar.B) {
                                    fValueOf = Float.valueOf(gvkVar.b);
                                } else if (((Boolean) gwvVar.k.dL()).booleanValue()) {
                                    float f = gvkVar.b;
                                    fValueOf = Float.valueOf(gwvVar.a(f + f));
                                } else {
                                    fValueOf = null;
                                }
                                if (fValueOf != null) {
                                    float fFloatValue = fValueOf.floatValue();
                                    gwvVar.k(fFloatValue);
                                    gwvVar.y(fFloatValue);
                                } else {
                                    gzi gziVar = hba.a;
                                    lzp lzpVar = (lzp) rwcVar.c();
                                    nkw nkwVar = (nkw) gwvVar.c.dL();
                                    float f2 = gvkVar.d;
                                    lzpVar.e = rwc.j(nkwVar);
                                    lzpVar.f = rwc.j(Float.valueOf(f2));
                                    if (((mhg) lzpVar.a.dL()).equals(mhg.INACTIVE) && !((Boolean) lzpVar.b.dL()).booleanValue() && lzpVar.e.h()) {
                                        if (((nkw) lzpVar.e.c()).equals(nkw.VIDEO)) {
                                            continue;
                                        } else if (((nkw) lzpVar.e.c()).equals(nkw.AMBER)) {
                                            continue;
                                        } else if (((nkw) lzpVar.e.c()).equals(nkw.SLOW_MOTION)) {
                                            continue;
                                        } else if (((nkw) lzpVar.e.c()).equals(nkw.ROOSTER)) {
                                            continue;
                                        } else if (((nkw) lzpVar.e.c()).equals(nkw.TIME_LAPSE)) {
                                            continue;
                                        } else if (((nkw) lzpVar.e.c()).equals(nkw.IMAX)) {
                                            continue;
                                        } else if (((nkw) lzpVar.e.c()).equals(nkw.SERENGETI)) {
                                            continue;
                                        } else if (((nkw) lzpVar.e.c()).equals(nkw.COTTAGE)) {
                                            continue;
                                        } else if (((nkw) lzpVar.e.c()).equals(nkw.PHOTO_SPHERE)) {
                                            continue;
                                        } else if (((nkw) lzpVar.e.c()).equals(nkw.VIDEO_NIGHT_SIGHT)) {
                                            continue;
                                        } else {
                                            synchronized (lzpVar) {
                                                lzpVar.g = true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (iOrdinal == 1) {
                    ((fvu) noyVar.a).x();
                }
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float fAbs = Math.abs(f);
        float fAbs2 = Math.abs(f2);
        rnu rnuVar = this.a.u;
        if (fAbs > fAbs2) {
            ((mzm) rnuVar.a).c(f);
            return false;
        }
        ((mzm) rnuVar.a).c(f2);
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        nql nqlVar = this.a;
        nqlVar.k = true;
        nqlVar.f.b();
        nqlVar.e.d(new PointF(motionEvent.getX(), motionEvent.getY()));
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        nql nqlVar = this.a;
        nqlVar.e.c();
        int i = nqlVar.p;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 != 0) {
            if (i2 == 1) {
                nqlVar.q.a(f);
                return true;
            }
            if (i2 != 2) {
                throw new IllegalStateException("Unknown scrolling state");
            }
            nqlVar.r.a(f2);
            return true;
        }
        if (nqlVar.n > 0) {
            return false;
        }
        float f3 = nqlVar.l + f;
        nqlVar.l = f3;
        nqlVar.m += f2;
        if (nql.d(f3)) {
            nqlVar.q.a(nqlVar.l);
            nqlVar.p = 2;
            return true;
        }
        if (!nql.d(nqlVar.m)) {
            return false;
        }
        nqlVar.r.a(nqlVar.m);
        nqlVar.p = 3;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        this.a.f.a(new PointF(motionEvent.getX(), motionEvent.getY()));
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.a.f.g(new PointF(motionEvent.getX(), motionEvent.getY()));
        return false;
    }
}
