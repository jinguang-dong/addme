package defpackage;

import android.view.View;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mzb extends myv {
    public View f;
    public mzd g;
    public mzd h;
    public Set i;

    public final void h(boolean z) {
        for (imi imiVar : this.i) {
            synchronized (imi.a) {
                imiVar.h = z;
                imiVar.b.execute(new ild(imiVar, 4));
            }
        }
    }
}
