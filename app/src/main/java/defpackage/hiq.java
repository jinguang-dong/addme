package defpackage;

import android.content.res.Resources;
import com.google.android.apps.camera.evcomp.EvCompView;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hiq extends him {
    public final EvCompView a;
    public final uem b;
    public final owq c;
    public final owq d;
    public final owq e;
    public final owf f;
    public int g;
    public int h;
    public float i;
    public final rwc j;
    public final owq k;
    public final Runnable l = new hjp(this, 1);
    public float m;
    public float n;
    private final owq o;
    private final owq p;
    private final owq q;
    private final owq r;

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, owq] */
    public hiq(uem uemVar, EvCompView evCompView, owq owqVar, owq owqVar2, owq owqVar3, owq owqVar4, gox goxVar, owq owqVar5, rwc rwcVar, owf owfVar, owq owqVar6) {
        this.b = uemVar;
        this.a = evCompView;
        this.e = owqVar4;
        this.o = owqVar;
        this.p = owqVar2;
        this.q = owqVar3;
        this.c = goxVar.c;
        this.d = goxVar.a;
        this.k = owqVar5;
        this.j = rwcVar;
        owqVar5.a(true);
        this.m = -1.0f;
        this.n = -1.0f;
        this.f = owfVar;
        this.r = owqVar6;
    }

    public final void h() throws Resources.NotFoundException {
        if (((hhv) this.e.dL()).equals(hhv.SINGLE)) {
            j();
        } else {
            rnt.L(true);
            owq owqVar = this.p;
            Float fValueOf = Float.valueOf(-1.0f);
            owqVar.a(fValueOf);
            this.q.a(fValueOf);
            this.m = -1.0f;
            this.n = -1.0f;
            ske.W(((lae) ((rwg) this.j).a).e(), new lwd(this, 1), out.a);
        }
        this.k.a(true);
    }

    public final void j() throws Resources.NotFoundException {
        if (((Boolean) ((ovx) this.f).d).booleanValue()) {
            this.a.f(0.5f);
        }
        l(0.5f, hhy.BRIGHTNESS);
    }

    public final void k() throws Resources.NotFoundException {
        if (((hhv) this.e.dL()).equals(hhv.SINGLE)) {
            j();
        } else {
            ((lae) ((rwg) this.j).a).f();
        }
        this.k.a(true);
    }

    public final void l(float f, hhy hhyVar) throws Resources.NotFoundException {
        if (f > 1.0f || f < 0.0f) {
            return;
        }
        if (((hhv) this.e.dL()) != hhv.SINGLE) {
            int iOrdinal = hhyVar.ordinal();
            if (iOrdinal == 0) {
                this.a.g(f);
                owq owqVar = this.p;
                if (f == ((Float) ((ovx) owqVar).d).floatValue()) {
                    return;
                }
                owqVar.a(Float.valueOf(f));
                owq owqVar2 = this.q;
                if (((Float) ((ovx) owqVar2).d).floatValue() == -1.0f) {
                    owqVar2.a(Float.valueOf(this.n));
                }
            } else if (iOrdinal == 1) {
                this.a.i(f);
                owq owqVar3 = this.q;
                if (f == ((Float) ((ovx) owqVar3).d).floatValue()) {
                    return;
                }
                owqVar3.a(Float.valueOf(f));
                owq owqVar4 = this.p;
                if (((Float) ((ovx) owqVar4).d).floatValue() == -1.0f) {
                    owqVar4.a(Float.valueOf(this.m));
                }
            }
            owq owqVar5 = this.r;
            jjp jjpVar = (jjp) owqVar5.dL();
            jjpVar.e = Optional.of((Float) ((ovx) this.q).d);
            owqVar5.a(jjpVar);
            jjp jjpVar2 = (jjp) owqVar5.dL();
            jjpVar2.b = Optional.of((Float) ((ovx) this.p).d);
            owqVar5.a(jjpVar2);
            return;
        }
        rnt.B(hhyVar.equals(hhy.BRIGHTNESS), "Single knob ev slider should have only one control(for brightness).");
        if (((lae) ((rwg) this.j).a).i()) {
            this.a.g(f);
            owq owqVar6 = this.p;
            if (f != ((Float) ((ovx) owqVar6).d).floatValue()) {
                Float fValueOf = Float.valueOf(f);
                owqVar6.a(fValueOf);
                owq owqVar7 = this.r;
                jjp jjpVar3 = (jjp) owqVar7.dL();
                jjpVar3.b = Optional.of(fValueOf);
                owqVar7.a(jjpVar3);
                return;
            }
            return;
        }
        int iRound = Math.round(this.h * f);
        int i = this.g;
        int i2 = iRound + i;
        this.a.g(((this.h * f) + i) * this.i);
        owq owqVar8 = this.o;
        if (i2 != ((Integer) ((ovx) owqVar8).d).intValue()) {
            Integer numValueOf = Integer.valueOf(i2);
            owqVar8.a(numValueOf);
            owq owqVar9 = this.r;
            jjp jjpVar4 = (jjp) owqVar9.dL();
            jjpVar4.i = Optional.of(numValueOf);
            owqVar9.a(jjpVar4);
        }
    }
}
