package defpackage;

import android.graphics.PointF;
import android.view.View;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nqk implements itk {
    final /* synthetic */ nql a;

    public nqk(nql nqlVar) {
        this.a = nqlVar;
    }

    @Override // defpackage.itk
    public final void d() {
        nql nqlVar = this.a;
        View viewFindViewById = nqlVar.i.findViewById(R.id.preview_overlay);
        nqlVar.f.g(new PointF(viewFindViewById.getWidth() / 2.0f, viewFindViewById.getHeight() / 2.0f));
    }

    @Override // defpackage.itk
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.itk
    public final /* synthetic */ void a(boolean z) {
    }

    @Override // defpackage.itk
    public final /* synthetic */ void b(boolean z) {
    }

    @Override // defpackage.itk
    public final /* synthetic */ void c(boolean z) {
    }

    @Override // defpackage.itk
    public final /* synthetic */ void f(boolean z) {
    }

    @Override // defpackage.itk
    public final /* synthetic */ void g(boolean z) {
    }

    @Override // defpackage.itk
    public final /* synthetic */ void h(boolean z) {
    }
}
