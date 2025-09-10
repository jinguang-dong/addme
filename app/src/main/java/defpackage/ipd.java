package defpackage;

import android.graphics.drawable.Animatable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.TwoStatePreference;
import com.android.settingslib.widget.MainSwitchBar;
import com.google.android.apps.camera.jupiter.uranus.UranusCharacterItem;
import com.google.android.apps.camera.ui.eduimageview.EduImageView;
import com.google.android.apps.camera.ui.preference.EmptyListPreference;
import com.google.android.apps.camera.ui.preference.ManagedSwitchPreference;
import com.google.android.material.card.MaterialCardView;
import com.google.ar.core.R;
import j$.util.Optional;
import j$.util.OptionalInt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ipd implements View.OnClickListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public ipd(EmptyListPreference emptyListPreference, sbp sbpVar, int i) {
        this.c = i;
        this.a = emptyListPreference;
        this.b = sbpVar;
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [android.view.View$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v32, types: [java.lang.Object, java.lang.Runnable] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.c) {
            case 0:
                ((ipk) this.a).ek((iqh) this.b, false);
                return;
            case 1:
                Object obj = this.b;
                boolean z = ((TwoStatePreference) obj).a;
                if (((Preference) obj).R(Boolean.valueOf(z))) {
                    return;
                }
                ((MainSwitchBar) this.a).b(!z);
                return;
            case 2:
                ipz ipzVar = (ipz) this.a;
                ipzVar.b.dismiss();
                luj lujVar = (luj) this.b;
                lujVar.d(luf.bb, false);
                if (ipzVar.d.isPresent()) {
                    lujVar.d(luf.ba, Integer.valueOf(((iqm) ipzVar.d.get()).f));
                }
                ipzVar.d = Optional.empty();
                ipzVar.e.run();
                return;
            case 3:
                UranusCharacterItem uranusCharacterItem = (UranusCharacterItem) view;
                Object obj2 = this.a;
                irs irsVar = (irs) obj2;
                if (irsVar.w) {
                    irsVar.h();
                    irsVar.o();
                    return;
                }
                irsVar.o();
                int i = uranusCharacterItem.j;
                if (i == 0) {
                    throw null;
                }
                if (i != 3) {
                    if (i == 1) {
                        Object obj3 = this.b;
                        irsVar.A = uranusCharacterItem;
                        irsVar.k((isg) obj3);
                        return;
                    }
                    return;
                }
                iqz iqzVar = uranusCharacterItem.g;
                Optional optionalF = irsVar.f(irsVar.v);
                if (!optionalF.isPresent() || iqzVar.equals(irsVar.v)) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams = uranusCharacterItem.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = irsVar.c(R.dimen.character_selected_item_width_with_expand);
                    uranusCharacterItem.setLayoutParams(layoutParams);
                }
                MaterialCardView materialCardView = (MaterialCardView) optionalF.get();
                ViewGroup.LayoutParams layoutParams2 = materialCardView.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = irsVar.c(R.dimen.character_unselected_item_width);
                    materialCardView.setLayoutParams(layoutParams2);
                }
                irs.p((ViewGroup) uranusCharacterItem.getParent());
                uranusCharacterItem.e(true);
                ((UranusCharacterItem) optionalF.get()).e(false);
                irsVar.v = iqzVar;
                irsVar.u.ifPresent(new ird(obj2, 4));
                return;
            case 4:
                ((irs) this.a).k((isg) this.b);
                return;
            case 5:
                String string = ((TextView) view).getText().toString();
                int iIndexOf = ((sbp) this.b).indexOf(string);
                EmptyListPreference emptyListPreference = (EmptyListPreference) this.a;
                emptyListPreference.setValueIndex(iIndexOf);
                emptyListPreference.getDialog().dismiss();
                emptyListPreference.setSummary(string);
                return;
            case 6:
                jju jjuVar = (jju) this.a;
                jjt jjtVarC = jjuVar.c();
                jkx jkxVar = (jkx) this.b;
                OptionalInt optionalIntQ = jkxVar.q(jjtVarC);
                RecyclerView recyclerView = jkxVar.j;
                recyclerView.getClass();
                optionalIntQ.ifPresent(new jkr(recyclerView, 2));
                jkxVar.l.e(jjuVar.c(), true, true);
                return;
            case 7:
                Animatable animatable = (Animatable) ((EduImageView) this.b).a.getDrawable();
                boolean zIsRunning = animatable.isRunning();
                Object obj4 = this.a;
                if (zIsRunning) {
                    animatable.stop();
                    ((ImageButton) obj4).setVisibility(0);
                    return;
                } else {
                    animatable.start();
                    ((ImageButton) obj4).setVisibility(8);
                    return;
                }
            case 8:
                Animatable animatable2 = (Animatable) ((EduImageView) this.b).a.getDrawable();
                if (animatable2.isRunning()) {
                    return;
                }
                Object obj5 = this.a;
                animatable2.start();
                ((ImageButton) obj5).setVisibility(8);
                return;
            case 9:
                Object obj6 = this.a;
                kto ktoVar = (kto) this.b;
                ksb ksbVar = ktoVar.o;
                if (ksbVar != null) {
                    krq krqVar = ktoVar.k;
                    ksa ksaVar = ((krr) obj6).a;
                    if (ksbVar.v(krqVar.a, ksaVar, ktoVar.p == ksaVar)) {
                        return;
                    }
                }
                ksc kscVar = ktoVar.n;
                if (kscVar != null) {
                    kscVar.w(((krr) obj6).a, ktoVar.k.a, 1);
                    return;
                }
                return;
            case 10:
                ((lif) this.b).a((lie) this.a);
                return;
            case 11:
                lyr lyrVar = (lyr) this.a;
                lyrVar.f.z(3, lyrVar.a.a);
                this.b.run();
                return;
            case 12:
                FrameLayout frameLayout = (FrameLayout) this.a;
                frameLayout.setVisibility(frameLayout.getVisibility() != 0 ? 0 : 8);
                ((ImageView) this.b).setImageResource(ManagedSwitchPreference.b(frameLayout));
                return;
            default:
                this.a.onClick(view);
                ((row) this.b).d(1);
                return;
        }
    }

    public /* synthetic */ ipd(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ ipd(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
