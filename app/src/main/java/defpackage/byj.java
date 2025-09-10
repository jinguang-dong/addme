package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byj extends ujq implements uiq {
    private final /* synthetic */ int e;
    public static final byj d = new byj(3);
    public static final byj c = new byj(2);
    public static final byj b = new byj(1);
    public static final byj a = new byj(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public byj(int i) {
        super(1);
        this.e = i;
    }

    @Override // defpackage.uiq
    public final /* synthetic */ Object a(Object obj) {
        int i = this.e;
        if (i == 0) {
            bfk bfkVar = (bfk) obj;
            bay.J(bfkVar, AndroidCompositionLocals_androidKt.a);
            return ((Context) bay.J(bfkVar, AndroidCompositionLocals_androidKt.b)).getResources();
        }
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return Boolean.valueOf(bzi.a(obj));
        }
        return ufg.a;
    }
}
