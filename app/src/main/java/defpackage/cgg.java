package defpackage;

import android.graphics.Matrix;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: PG */
@ueo
/* loaded from: classes.dex */
public final class cgg {
    public final Object a;

    public cgg() {
        this.a = new LinkedHashMap();
    }

    public cgg(View view, byte[] bArr) {
        this.a = view;
        rnt.aO(3, new bol(this, 15));
    }

    public cgg(View view) {
        new cgg(view, null);
        Choreographer.getInstance();
        this.a = view;
        new cge(new ccm(""), cdn.a);
        int i = cgd.a;
        new ArrayList();
        rnt.aO(3, new bol(this, 16));
        new CursorAnchorInfo.Builder();
        bld.d();
        new Matrix();
    }
}
