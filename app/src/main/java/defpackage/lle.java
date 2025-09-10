package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;
import com.google.ar.core.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lle implements nkm {
    private static final sbv s;
    private static final sbv t;
    private static final sbv u;
    private static final sbv v;
    private final owf A;
    private final owf B;
    private TextView E;
    private final ocq H;
    public final Context a;
    public final out b;
    public final owf c;
    public final tzj d;
    public final jjn e;
    public final owf f;
    public final owq g;
    public TextView h;
    public TextView i;
    public TextView j;
    public ImageView k;
    public ImageView l;
    public View m;
    public View n;
    public View o;
    public final fdq p;
    private final owf w;
    private final owf x;
    private final owf y;
    private final owf z;
    public final qpt q = new qpt((byte[]) null);
    private final lky C = new lky();
    private final lky D = new lky();
    private long F = 0;
    private our G = new our();

    static {
        nmr nmrVar = nmr.WIDEST;
        Integer numValueOf = Integer.valueOf(R.string.ultrawide_lens);
        nmr nmrVar2 = nmr.WIDEST_RM;
        nmr nmrVar3 = nmr.MIDDLE;
        Integer numValueOf2 = Integer.valueOf(R.string.wide_lens);
        nmr nmrVar4 = nmr.MIDDLE_RM;
        nmr nmrVar5 = nmr.NARROWEST;
        Integer numValueOf3 = Integer.valueOf(R.string.tele_lens);
        nmr nmrVar6 = nmr.NARROWEST_RM;
        nmr nmrVar7 = nmr.UNKNOWN;
        Integer numValueOf4 = Integer.valueOf(R.string.auto_lens);
        s = sbv.r(nmrVar, numValueOf, nmrVar2, numValueOf, nmrVar3, numValueOf2, nmrVar4, numValueOf2, nmrVar5, numValueOf3, nmrVar6, numValueOf3, nmrVar7, numValueOf4);
        t = sbv.q(lkk.ULTRAWIDE, numValueOf, lkk.WIDE, numValueOf2, lkk.TELE, numValueOf3, lkk.AUTO, numValueOf4);
        u = sbv.q(lkk.ULTRAWIDE, "1.95", lkk.WIDE, "1.68", lkk.TELE, "2.8", lkk.AUTO, "");
        v = sbv.r(nmr.WIDEST, "1.95", nmr.WIDEST_RM, "1.95", nmr.MIDDLE, "1.68", nmr.MIDDLE_RM, "1.68", nmr.NARROWEST, "2.8", nmr.NARROWEST_RM, "2.8", nmr.UNKNOWN, "");
    }

    public lle(Context context, ocq ocqVar, fdq fdqVar, out outVar, owf owfVar, owf owfVar2, owf owfVar3, owf owfVar4, owf owfVar5, tzj tzjVar, jjn jjnVar, owf owfVar6, owf owfVar7, owf owfVar8, owf owfVar9, owf owfVar10, owq owqVar) {
        this.a = context;
        this.H = ocqVar;
        this.p = fdqVar;
        this.b = outVar;
        this.c = owfVar;
        this.w = owfVar2;
        this.x = owfVar3;
        this.y = owfVar4;
        this.z = owfVar5;
        this.d = tzjVar;
        this.e = jjnVar;
        this.A = owfVar6;
        this.f = owl.c(owfVar8, owfVar9, owfVar7);
        this.B = owfVar10;
        this.g = owqVar;
    }

    @Override // defpackage.nkm
    public final void a() {
        ViewStub viewStub = (ViewStub) this.H.c(R.id.ark_values);
        viewStub.setLayoutResource(R.layout.pro_values);
        View viewInflate = viewStub.inflate();
        this.o = viewInflate;
        this.E = (TextView) viewInflate.findViewById(R.id.lens_value);
        this.h = (TextView) this.o.findViewById(R.id.shutter_speed_value);
        this.i = (TextView) this.o.findViewById(R.id.iso_value);
        this.j = (TextView) this.o.findViewById(R.id.focus_value);
        this.k = (ImageView) this.o.findViewById(R.id.shutter_icon);
        this.l = (ImageView) this.o.findViewById(R.id.iso_icon);
        this.n = this.o.findViewById(R.id.iso_value_layout);
        this.m = this.o.findViewById(R.id.shutter_value_layout);
        this.j.setOnClickListener(new kcm(this, 13));
        this.n.setOnClickListener(new kcm(this, 14));
        this.m.setOnClickListener(new kcm(this, 15));
        this.k.setImageResource(R.drawable.gs_hdr_auto_wght600_vd_theme_48);
        this.l.setImageResource(R.drawable.gs_hdr_auto_wght600_vd_theme_48);
        fdq fdqVar = this.p;
        our ourVarJ = fdqVar.j();
        ksq ksqVar = new ksq(this, 19);
        out outVar = this.b;
        ourVarJ.d(this.c.dK(ksqVar, outVar));
        fdqVar.j().d(this.x.dK(new lld(this, 8), outVar));
        fdqVar.j().d(this.w.dK(new lld(this, 0), outVar));
        fdqVar.j().d(this.y.dK(new lld(this, 2), outVar));
        fdqVar.j().d(this.z.dK(new lld(this, 3), outVar));
        fdqVar.j().d(((FocusIndicatorView) this.d.a()).j.dK(new lld(this, 4), outVar));
        fdqVar.j().d(this.A.dK(new lld(this, 5), outVar));
        fdqVar.j().d(owb.a(this.B).dK(new lld(this, 7), outVar));
    }

    public final void b() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.F >= 500) {
            lku lkuVar = (lku) this.z.dL();
            lky lkyVar = this.C;
            lkyVar.b(lkuVar.a);
            owf owfVar = this.c;
            if (((jjq) owfVar.dL()).g.isEmpty()) {
                long jRound = Math.round(lkyVar.a());
                TextView textView = this.h;
                Context context = this.a;
                textView.setText(context.getString(R.string.shutter_speed_value, qpt.bQ(jRound)));
                this.h.setContentDescription(context.getString(R.string.shutter_speed_value_desc, qpt.bP(jRound)));
            }
            ljq ljqVar = (ljq) this.y.dL();
            lky lkyVar2 = this.D;
            lkyVar2.b(ljqVar.a);
            if (((jjq) owfVar.dL()).f.isEmpty()) {
                this.i.setText(this.a.getString(R.string.iso_value, Integer.valueOf((int) Math.round(lkyVar2.a()))));
            }
            this.F = jElapsedRealtime;
        }
    }

    public final void c(Optional optional, boolean z) {
        if (optional.isPresent()) {
            this.j.setText(R.string.manual_focus);
        } else if (z) {
            this.j.setText(R.string.locked_focus);
        } else {
            this.j.setText(R.string.auto_focus);
        }
    }

    public final void d() {
        lkk lkkVar = (lkk) this.w.dL();
        nmr nmrVar = (nmr) this.x.dL();
        e();
        lkk lkkVar2 = lkk.AUTO;
        if (lkkVar == lkkVar2) {
            sbv sbvVar = s;
            if (sbvVar.containsKey(nmrVar)) {
                sbv sbvVar2 = v;
                if (sbvVar2.containsKey(nmrVar)) {
                    this.E.setText(this.a.getString(((Integer) sbvVar.get(nmrVar)).intValue(), sbvVar2.get(nmrVar)));
                    return;
                }
            }
        }
        if (lkkVar != lkkVar2) {
            sbv sbvVar3 = t;
            if (sbvVar3.containsKey(lkkVar)) {
                sbv sbvVar4 = u;
                if (sbvVar4.containsKey(lkkVar)) {
                    this.E.setText(this.a.getString(((Integer) sbvVar3.get(lkkVar)).intValue(), sbvVar4.get(lkkVar)));
                }
            }
        }
    }

    public final void e() {
        owf owfVar = this.f;
        int i = true != ((Boolean) owfVar.dL()).booleanValue() ? 8 : 0;
        if (i == 0 && this.o == null) {
            a();
        }
        View view = this.o;
        if (view != null) {
            view.setVisibility(i);
        }
        this.G.close();
        if (this.o == null || !((Boolean) owfVar.dL()).booleanValue()) {
            this.g.a(0);
            return;
        }
        this.G = new our();
        fjt fjtVar = new fjt(this, 7);
        this.o.addOnLayoutChangeListener(fjtVar);
        this.G.d(new hty(this, fjtVar, 20, null));
    }
}
