package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface kse extends mxl {
    View a();

    ImageView d(int i);

    void e();

    void f(int i, boolean z, int i2, String str, krs krsVar);

    void g(ltr ltrVar);

    int getImportantForAccessibility();

    Resources getResources();

    boolean h();

    void i();

    void j(int i);

    void k(boolean z, int i, boolean z2);

    boolean postDelayed(Runnable runnable, long j);

    void setEnabled(boolean z);

    void setImportantForAccessibility(int i);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setVisibility(int i);
}
