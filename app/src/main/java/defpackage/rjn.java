package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rjn {
    public final MaterialButton a;
    public roc b;
    public rom c;
    public ctp d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public PorterDuff.Mode k;
    public ColorStateList l;
    public ColorStateList m;
    public ColorStateList n;
    public Drawable o;
    public boolean r;
    public LayerDrawable t;
    public int u;
    public AmbientModeSupport.AmbientController v;
    public boolean p = false;
    public boolean q = false;
    public boolean s = true;

    public rjn(MaterialButton materialButton, roc rocVar) {
        this.a = materialButton;
        this.b = rocVar;
    }

    private final rnx g(boolean z) {
        LayerDrawable layerDrawable = this.t;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (rnx) ((LayerDrawable) ((InsetDrawable) this.t.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final rnx a() {
        return g(false);
    }

    public final rnx b() {
        return g(true);
    }

    public final void c() {
        this.p = true;
        MaterialButton materialButton = this.a;
        materialButton.n(this.l);
        materialButton.o(this.k);
    }

    public final void d(roc rocVar) {
        this.b = rocVar;
        this.c = null;
        e();
    }

    public final void e() {
        rnx rnxVarA = a();
        if (rnxVarA != null) {
            rom romVar = this.c;
            if (romVar != null) {
                rnxVarA.p(romVar);
            } else {
                rnxVarA.m(this.b);
            }
            ctp ctpVar = this.d;
            if (ctpVar != null) {
                rnxVarA.k(ctpVar);
            }
        }
        rnx rnxVarB = b();
        if (rnxVarB != null) {
            rom romVar2 = this.c;
            if (romVar2 != null) {
                rnxVarB.p(romVar2);
            } else {
                rnxVarB.m(this.b);
            }
            ctp ctpVar2 = this.d;
            if (ctpVar2 != null) {
                rnxVarB.k(ctpVar2);
            }
        }
        LayerDrawable layerDrawable = this.t;
        rol rolVar = null;
        if (layerDrawable != null && layerDrawable.getNumberOfLayers() > 1) {
            rolVar = this.t.getNumberOfLayers() > 2 ? (rol) this.t.getDrawable(2) : (rol) this.t.getDrawable(1);
        }
        if (rolVar != null) {
            rolVar.m(this.b);
            if (rolVar instanceof rnx) {
                rnx rnxVar = (rnx) rolVar;
                rom romVar3 = this.c;
                if (romVar3 != null) {
                    rnxVar.p(romVar3);
                }
                ctp ctpVar3 = this.d;
                if (ctpVar3 != null) {
                    rnxVar.k(ctpVar3);
                }
            }
        }
    }

    public final void f(AmbientModeSupport.AmbientController ambientController) {
        this.v = ambientController;
        rnx rnxVarA = a();
        if (rnxVarA != null) {
            rnxVarA.j = ambientController;
        }
    }
}
