package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jkw extends lg {
    public final ColorStateList s;
    public final ColorStateList t;
    public final ColorStateList u;

    public jkw(View view) {
        super(view);
        int[][] iArr = {new int[]{R.attr.state_pressed}, new int[0]};
        this.s = new ColorStateList(iArr, new int[]{ojl.aO(view), ojl.aQ(view)});
        this.t = new ColorStateList(iArr, new int[]{ojl.aO(view), ojl.aR(view)});
        this.u = new ColorStateList(iArr, new int[]{ojl.aJ(view), ojl.aM(view)});
    }
}
