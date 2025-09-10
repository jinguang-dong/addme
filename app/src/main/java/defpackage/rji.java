package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rji extends coy {
    private final View b;
    private int c;
    private int d;
    private final int[] e;

    public rji(View view) {
        super(0);
        this.e = new int[2];
        this.b = view;
    }

    @Override // defpackage.coy
    public final void b() {
        View view = this.b;
        int[] iArr = this.e;
        view.getLocationOnScreen(iArr);
        this.c = iArr[1];
    }

    @Override // defpackage.coy
    public final void c(cpp cppVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((sgh) it.next()).h() & 8) != 0) {
                this.b.setTranslationY(rhn.b(this.d, 0, r3.g()));
                return;
            }
        }
    }

    @Override // defpackage.coy
    public final void d(sgh sghVar) {
        this.b.setTranslationY(0.0f);
    }

    @Override // defpackage.coy
    public final void e(sgh sghVar) {
        View view = this.b;
        int[] iArr = this.e;
        view.getLocationOnScreen(iArr);
        int i = this.c - iArr[1];
        this.d = i;
        view.setTranslationY(i);
    }
}
