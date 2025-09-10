package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.util.Pair;
import android.view.View;
import android.widget.ProgressBar;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.jupiter.uranus.UranusAnimationView;
import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class irk {
    public static final sgv a = sgv.g("irk");
    public static final sbv b;
    public static final sbv c;
    public final sbv d;
    public final out h;
    public final sbp i;
    public final iru j;
    public final irc k;
    public final ira l;
    public syu q;
    public final mbq r;
    public AmbientModeSupport.AmbientController t;
    private final Optional u;
    private final Rect v;
    private final View w;
    private final hbj x;
    public final List e = new ArrayList();
    public final Map f = new EnumMap(iri.class);
    public final Map g = new EnumMap(iri.class);
    public boolean m = false;
    public Optional n = Optional.empty();
    public iqp o = iqp.IDLE;
    public iqq p = iqq.IDLE;
    public final ggg s = new ggg((char[]) null);

    static {
        sbr sbrVar = new sbr();
        sbrVar.f(iqq.IDLE, isj.CHARACTER_MAIN_IDLE_LOOP);
        sbrVar.f(iqq.HINT_ENTER, isj.d);
        sbrVar.f(iqq.HINT, isj.CHARACTER_MAIN_HINT);
        sbrVar.f(iqq.HINT_EXIT, isj.CHARACTER_MAIN_HINT_EXIT);
        sbrVar.f(iqq.SURPRISE_ENTER, isj.CHARACTER_MAIN_SURPRISE_ENTER);
        sbrVar.f(iqq.SURPRISE_LOOP, isj.CHARACTER_MAIN_SURPRISE_LOOP);
        sbrVar.f(iqq.SURPRISE_EXIT, isj.CHARACTER_MAIN_SURPRISE_EXIT);
        b = sbrVar.b();
        sbr sbrVar2 = new sbr();
        sbrVar2.f(iqq.IDLE, isj.CHARACTER_SUB_IDLE_LOOP);
        sbrVar2.f(iqq.HINT, isj.CHARACTER_SUB_HINT);
        c = sbrVar2.b();
    }

    public irk(sbv sbvVar, sbp sbpVar, Rect rect, View view, out outVar, hbj hbjVar, ira iraVar, iru iruVar, irc ircVar, Optional optional, mbq mbqVar) {
        this.d = sbvVar;
        this.i = sbpVar;
        this.v = rect;
        this.w = view;
        this.j = iruVar;
        this.l = iraVar;
        this.u = optional;
        this.k = ircVar;
        this.r = mbqVar;
        this.h = outVar;
        this.x = hbjVar;
    }

    public final Optional a(sbv sbvVar, iqq iqqVar) {
        Optional optionalOfNullable = Optional.ofNullable((isj) sbvVar.get(iqqVar));
        sbv sbvVar2 = this.d;
        sbvVar2.getClass();
        return optionalOfNullable.map(new idh(sbvVar2, 6));
    }

    public final void b(iri iriVar, irj irjVar) {
        this.s.f(iriVar, irjVar);
    }

    public final void c(iri iriVar) {
        efs efsVar = (efs) this.g.get(iriVar);
        this.f.remove(iriVar);
        if (efsVar != null) {
            efsVar.j();
            elh elhVar = efsVar.b;
            elhVar.removeAllUpdateListeners();
            elhVar.addUpdateListener(efsVar.e);
            efsVar.o();
        }
    }

    public final void d(iqq iqqVar, efh efhVar) {
        iri iriVar = iri.CHARACTER_MAIN;
        g(iriVar, b.values());
        c(iriVar);
        f(iriVar, iqqVar, efhVar);
    }

    public final void e(iqq iqqVar, efh efhVar) {
        iri iriVar = iri.c;
        g(iriVar, c.values());
        c(iriVar);
        f(iriVar, iqqVar, efhVar);
    }

    public final void f(final iri iriVar, final iqq iqqVar, efh efhVar) {
        efs efsVar = (efs) this.g.get(iriVar);
        if (efhVar == null || efsVar == null) {
            return;
        }
        efsVar.v(efhVar);
        this.f.put(iriVar, Float.valueOf(efsVar.b()));
        Rect rectA = ira.a(efhVar.g, this.v);
        efsVar.setCallback(this.w);
        efsVar.setBounds(new Rect(0, 0, rectA.width(), rectA.height()));
        efsVar.t(true == iqqVar.equals(iqq.BACKGROUND) ? -1 : 0);
        efsVar.s(0.0f);
        efsVar.f(new ValueAnimator.AnimatorUpdateListener() { // from class: irf
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ?? r0 = this.a.s.a;
                iri iriVar2 = iriVar;
                if (r0.containsKey(iriVar2)) {
                    iqq iqqVar2 = iqqVar;
                    List list = (List) r0.get(iriVar2);
                    list.getClass();
                    Iterable$EL.forEach(list, new fxu(valueAnimator, iqqVar2, 14));
                }
            }
        });
        efsVar.b.addListener(new irh(this, iriVar, iqqVar));
    }

    public final void g(iri iriVar, sbe sbeVar) {
        Map map = this.g;
        if (map.containsKey(iriVar)) {
            return;
        }
        sbv sbvVar = this.d;
        sbvVar.getClass();
        if (Collection.EL.stream(sbvVar.keySet()).anyMatch(new fme(sbeVar, 19))) {
            map.put(iriVar, new efs());
        }
    }

    public final void h() {
        this.m = true;
        mbq mbqVar = this.r;
        Object obj = mbqVar.b;
        synchronized (obj) {
            if (mbqVar.d) {
                return;
            }
            for (Pair pair : mbqVar.e) {
                synchronized (obj) {
                    mbqVar.a().setVolume(((Integer) pair.first).intValue(), 0.0f, 0.0f);
                }
            }
        }
    }

    public final void i() {
        ProgressBar progressBar;
        AmbientModeSupport.AmbientController ambientController = this.t;
        if (ambientController == null || (progressBar = ((iry) ambientController.a).m) == null) {
            return;
        }
        progressBar.setVisibility(8);
    }

    public final void j(iri iriVar, Rect rect) {
        AmbientModeSupport.AmbientController ambientController = this.t;
        if (ambientController == null || !iriVar.equals(iri.CHARACTER_MAIN)) {
            return;
        }
        iry iryVar = (iry) ambientController.a;
        UranusAnimationView uranusAnimationView = iryVar.k;
        Rect rectA = ira.a(rect, iryVar.h);
        uranusAnimationView.c = rectA;
        uranusAnimationView.layout(rectA.left, rectA.top, rectA.right, rectA.bottom);
        uranusAnimationView.requestLayout();
    }

    public final void k(iqq iqqVar) {
        gzg gzgVar = gza.a;
        this.r.h();
        a(b, iqqVar).ifPresent(new ird(this, 2));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Map] */
    public final void l() {
        i();
        syu syuVar = this.q;
        if (syuVar != null) {
            syuVar.cancel(false);
            this.q = null;
        }
        irc ircVar = this.k;
        ircVar.b = false;
        ircVar.b();
        this.r.h();
        ?? r0 = this.s.a;
        Iterator it = r0.entrySet().iterator();
        while (it.hasNext()) {
            ((List) ((Map.Entry) it.next()).getValue()).clear();
        }
        r0.clear();
        Map map = this.g;
        Iterator it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            c((iri) it2.next());
        }
        this.f.clear();
        map.clear();
    }

    public final void m() {
        this.m = false;
        mbq mbqVar = this.r;
        Object obj = mbqVar.b;
        synchronized (obj) {
            if (mbqVar.d) {
                return;
            }
            for (Pair pair : mbqVar.e) {
                synchronized (obj) {
                    mbqVar.a().setVolume(((Integer) pair.first).intValue(), 1.0f, 1.0f);
                }
            }
        }
    }

    public final boolean n(iqq iqqVar) {
        isj isjVar = (isj) b.get(iqqVar);
        if (isjVar == null) {
            return false;
        }
        return this.d.containsKey(isjVar);
    }

    public final void o() {
        this.u.isPresent();
    }
}
