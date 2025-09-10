package defpackage;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.widget.CheckBox;
import com.google.android.apps.camera.evcomp.EvCompView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hil extends hig {
    public final EvCompView a;
    public final CheckBox b;
    public final ObjectAnimator c;
    public final hiq d;
    public final owq e;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, owq] */
    public hil(EvCompView evCompView, CheckBox checkBox, ObjectAnimator objectAnimator, hiq hiqVar, gox goxVar) {
        this.a = evCompView;
        this.b = checkBox;
        this.c = objectAnimator;
        this.d = hiqVar;
        this.e = goxVar.b;
        objectAnimator.addListener(new hih(evCompView));
    }

    public final void h(boolean z, boolean z2) throws Resources.NotFoundException {
        if (z2) {
            this.d.h();
        }
        if (z) {
            this.c.start();
        } else {
            this.c.cancel();
            this.a.setAlpha(1.0f);
        }
    }
}
