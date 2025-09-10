package com.google.android.apps.camera.faceindicator;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.google.ar.core.R;
import defpackage.efm;
import defpackage.fdi;
import defpackage.gzj;
import defpackage.hkp;
import defpackage.hks;
import defpackage.hkt;
import defpackage.nmu;
import defpackage.pnu;
import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.stream.Collectors;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FaceIndicatorView extends hkt {
    public int a;
    public final Map b;
    public final Map c;
    public final Rect d;
    public final Rect e;
    public List f;
    public int g;
    public boolean h;
    public boolean i;
    private final Map l;
    private final Paint m;
    private int n;
    private int o;
    private final RectF p;

    /* JADX WARN: Multi-variable type inference failed */
    public FaceIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 1500;
        this.d = new Rect(0, 0, 0, 0);
        this.e = new Rect(0, 0, 0, 0);
        this.n = 0;
        new HashSet();
        this.o = 0;
        this.p = new RectF();
        Resources resources = getResources();
        Paint paint = new Paint();
        this.m = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        float f = resources.getDisplayMetrics().xdpi / 160.0f;
        paint.setStrokeWidth(Math.round(f + f));
        paint.setColor(-1);
        this.b = new HashMap();
        this.c = new HashMap();
        this.l = new HashMap();
        this.h = true;
        if (context instanceof fdi) {
            this.o = ((Integer) ((fdi) context).b().a(gzj.a).get()).intValue();
        }
    }

    private final int i(int i) {
        Integer num = (Integer) this.l.get(Integer.valueOf(i));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    private final int j() {
        List list = this.f;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    private final boolean k(int i, int i2, RectF rectF) {
        float[] fArr = {i, i2};
        Matrix matrixH = h();
        if (matrixH == null || rectF.isEmpty()) {
            return false;
        }
        matrixH.mapPoints(fArr);
        return fArr[0] > rectF.width() + (-50.0f) || fArr[0] <= 50.0f || fArr[1] > rectF.height() + (-50.0f) || fArr[1] < 50.0f;
    }

    final int a() {
        float f = true != this.i ? 1.0f : 2.0f;
        int i = this.o;
        if (i == 0) {
            i = 120;
        }
        return (int) (f * i);
    }

    public final void b() {
        this.f = null;
        this.b.clear();
        this.c.clear();
        this.l.clear();
        e();
        invalidate();
    }

    public final void c() {
        this.h = true;
    }

    public final void d(boolean z) {
        hks hksVar;
        if (j() == 0) {
            return;
        }
        for (pnu pnuVar : this.f) {
            if (pnuVar != null && (hksVar = (hks) this.b.get(Integer.valueOf(pnuVar.a))) != null) {
                hksVar.b(z);
            }
        }
    }

    public final void e() {
        int i;
        if (this.h) {
            int iJ = j();
            if (iJ > 0 && this.n == iJ) {
                List<pnu> list = (List) Collection.EL.stream(this.f).sorted(Comparator$CC.comparingInt(new hkp(1))).collect(Collectors.toList());
                Map map = this.b;
                List list2 = (List) Collection.EL.stream(map.keySet()).collect(Collectors.toList());
                for (pnu pnuVar : list) {
                    if (pnuVar != null && !map.isEmpty()) {
                        int i2 = 0;
                        for (Map.Entry entry : map.entrySet()) {
                            if (((Integer) entry.getKey()).equals(Integer.valueOf(pnuVar.a)) && i2 <= 5) {
                                list2.remove(entry.getKey());
                                i2++;
                            }
                        }
                    }
                }
                map.keySet().removeAll(list2);
                f(list2);
            } else if (iJ > 0 && this.n < iJ) {
                for (pnu pnuVar2 : this.f) {
                    if (pnuVar2 != null && pnuVar2.b >= 50) {
                        Map map2 = this.b;
                        int i3 = pnuVar2.a;
                        hks hksVar = (hks) map2.get(Integer.valueOf(i3));
                        if (hksVar != null) {
                            if (hksVar.k) {
                                Rect rect = pnuVar2.c;
                                if (rect.width() >= a() + (i(i3) * 30) && rect.height() >= a() + (i(i3) * 30) && !hksVar.h) {
                                    hksVar.i.cancel();
                                    hksVar.i.start();
                                    hksVar.h = true;
                                    hksVar.k = false;
                                }
                            } else {
                                hksVar.b(false);
                            }
                        }
                    }
                }
            } else if (iJ > 0 && this.n > iJ) {
                Map map3 = this.b;
                List list3 = (List) Collection.EL.stream(map3.keySet()).collect(Collectors.toList());
                for (pnu pnuVar3 : this.f) {
                    if (!map3.isEmpty()) {
                        int i4 = 0;
                        for (Map.Entry entry2 : map3.entrySet()) {
                            if (((Integer) entry2.getKey()).intValue() == pnuVar3.a && i4 <= 5) {
                                list3.remove(entry2.getKey());
                                i4++;
                            }
                        }
                    }
                }
                map3.keySet().removeAll(list3);
                f(list3);
            }
            if (iJ > 0 || this.n > 0) {
                this.n = j();
                if (iJ > 0) {
                    for (pnu pnuVar4 : (List) Collection.EL.stream(this.f).sorted(Comparator$CC.comparingInt(new hkp(0))).collect(Collectors.toList())) {
                        if (pnuVar4 != null && (i = pnuVar4.a) >= 0) {
                            Map map4 = this.b;
                            Integer numValueOf = Integer.valueOf(i);
                            hks hksVar2 = (hks) map4.get(numValueOf);
                            if (hksVar2 == null) {
                                Rect rect2 = pnuVar4.c;
                                if (rect2.width() >= a() + (i(i) * 30) && rect2.height() >= a() + (i(i) * 30) && pnuVar4.b >= 50 && !k(rect2.centerX(), rect2.centerY(), this.p)) {
                                    hks hksVar3 = new hks(pnuVar4, h(), this.a);
                                    map4.put(numValueOf, hksVar3);
                                    hksVar3.a();
                                }
                            } else if (pnuVar4.b >= 25) {
                                Rect rect3 = pnuVar4.c;
                                if ((rect3.width() < a() || rect3.height() < a() || k(rect3.centerX(), rect3.centerY(), this.p)) && hksVar2.h) {
                                    this.l.put(numValueOf, Integer.valueOf(i(i) + 1));
                                    hksVar2.b(true);
                                } else {
                                    hksVar2.c(pnuVar4, h());
                                }
                            }
                        }
                    }
                }
                if (g()) {
                    invalidate();
                }
            }
        }
    }

    final void f(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        invalidate();
    }

    public final boolean g() {
        Iterator it = this.b.entrySet().iterator();
        while (it.hasNext()) {
            if (!((hks) ((Map.Entry) it.next()).getValue()).k) {
                return true;
            }
        }
        Iterator it2 = this.c.entrySet().iterator();
        while (it2.hasNext()) {
            if (!((hks) ((Map.Entry) it2.next()).getValue()).k) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hkt, android.view.View
    public final void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        this.p.set(i, i2, i3, i4);
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        d(true);
        b();
        super.onConfigurationChanged(configuration);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        if (this.h) {
            if (j() > 0) {
                Map map = this.b;
                if (!map.isEmpty()) {
                    Canvas canvas2 = canvas;
                    canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                    for (Map.Entry entry : map.entrySet()) {
                        hks hksVar = (hks) entry.getValue();
                        Paint paint = this.m;
                        int i = this.g;
                        boolean z = true;
                        if (i != 90 && i != 270) {
                            z = false;
                        }
                        if (hksVar.g > 0) {
                            if (!hksVar.i.isRunning()) {
                                hksVar.f = hksVar.c.a;
                            }
                            paint.setAlpha(hksVar.g);
                            float f = hksVar.f * 1.3f;
                            double dSqrt = Math.sqrt(f) * 1.600000023841858d;
                            nmu nmuVar = hksVar.a;
                            float f2 = nmuVar.a;
                            nmu nmuVar2 = hksVar.b;
                            float f3 = nmuVar2.a;
                            if (hksVar.n >= 50.0f || hksVar.o >= 50.0f) {
                                f2 = hksVar.l;
                                f3 = hksVar.m;
                                nmuVar.b();
                                nmuVar2.b();
                            }
                            float f4 = 1.3f * f;
                            float f5 = f * 1.1f;
                            float f6 = (float) dSqrt;
                            if (z) {
                                canvas2.drawRoundRect(f2 - f4, f3 - f5, f4 + f2, f3 + f5, f6, f6, paint);
                            } else {
                                canvas2 = canvas;
                                canvas2.drawRoundRect(f2 - f5, f3 - f4, f2 + f5, f3 + f4, f6, f6, paint);
                            }
                        }
                        canvas2 = canvas;
                    }
                }
            } else {
                this.b.clear();
            }
        }
        if (this.h) {
            this.c.clear();
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        efm.c(getContext(), R.raw.best_take_facebox).a.getClass();
    }
}
