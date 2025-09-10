package defpackage;

import android.widget.Space;
import com.google.android.apps.camera.bottombar.BottomBar;
import com.google.android.apps.camera.bottombar.SideButtonContainer;
import com.google.ar.core.R;
import j$.util.function.BiConsumer$CC;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fvk implements BiConsumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fvk(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, owq] */
    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        boolean z;
        int i = this.b;
        if (i == 0) {
            rwc rwcVar = (rwc) obj2;
            Space space = (Space) ((BottomBar) this.a).m.get((fvo) obj);
            if (space != null) {
                if (rwcVar.h()) {
                    space.setVisibility(4);
                    return;
                } else {
                    space.setVisibility(8);
                    return;
                }
            }
            return;
        }
        boolean z2 = true;
        if (i == 1) {
            ((BottomBar) this.a).o((fvo) obj, (SideButtonContainer) obj2);
            return;
        }
        if (i == 2) {
            gsn.o(this.a, (kqy) obj, (Boolean) obj2);
            return;
        }
        if (i != 3) {
            this.a.put((lcz) obj, (peq) ((uem) obj2).a());
            return;
        }
        kqy kqyVar = (kqy) obj;
        Boolean bool = (Boolean) obj2;
        boolean zBooleanValue = bool.booleanValue();
        ?? r6 = this.a;
        if (zBooleanValue && ((ksa) r6.dL()).equals(ksa.CAPTURE_RESOLUTION_HI_RES)) {
            z = true;
        } else {
            z = true;
            z2 = false;
        }
        if (!bool.booleanValue() || !((ksa) r6.dL()).equals(ksa.CAPTURE_RESOLUTION_DEFAULT)) {
            z = false;
        }
        krs krsVar = krs.CAPTURE_RESOLUTION;
        kqyVar.g(z2, R.drawable.gs_50mp_fill1_vd_theme_24, R.string.lobster_option_hires, "CaptureResolution", krsVar);
        kqyVar.g(z, R.drawable.gs_12mp_fill1_vd_theme_24, R.string.lobster_option_default, "CaptureResolution", krsVar);
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        int i = this.b;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? BiConsumer$CC.$default$andThen(this, biConsumer) : BiConsumer$CC.$default$andThen(this, biConsumer) : BiConsumer$CC.$default$andThen(this, biConsumer) : BiConsumer$CC.$default$andThen(this, biConsumer) : BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
