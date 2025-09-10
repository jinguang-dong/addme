package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class kro implements krz {
    @Override // defpackage.krz
    public final int A() {
        return h().ordinal();
    }

    @Override // defpackage.krz
    public Drawable B(ksa ksaVar, Resources resources) {
        return resources.getDrawable(d(ksaVar), null);
    }

    @Override // defpackage.krz
    public final /* synthetic */ ksd D(final Context context, rbb rbbVar) {
        final Intent intentCr = qpt.cr(context, rbbVar, rbb.a);
        if (intentCr == null) {
            ((sgt) krx.a.c().M(3429)).v("Camera Hub intent for %s is null", rbbVar);
            return null;
        }
        if (intentCr.resolveActivity(context.getPackageManager()) != null) {
            return new ksd() { // from class: krw
                @Override // defpackage.ksd
                public final void a(ksa ksaVar, boolean z) {
                    context.startActivity(intentCr);
                }
            };
        }
        ((sgt) krx.a.c().M(3428)).v("No activity found to handle Camera Hub intent for %s", rbbVar);
        return null;
    }

    protected int b(ksa ksaVar) {
        throw new AssertionError("Override either getContentDescOfOption or getContentDescIdOfOption");
    }

    protected int d(ksa ksaVar) {
        throw new AssertionError("Override either getIconIdOfOption or getIconOfOption");
    }

    @Override // defpackage.krz
    public /* synthetic */ kry dZ() {
        return kry.DEFAULT;
    }

    @Override // defpackage.krz
    public int eI() {
        return 0;
    }

    protected int f(ksa ksaVar) {
        throw new AssertionError("Override either getLabelIdOfOption or getLabelOfOption");
    }

    @Override // defpackage.krz
    public ksd i() {
        return null;
    }

    @Override // defpackage.krz
    public rbb k() {
        return null;
    }

    @Override // defpackage.krz
    public boolean o(krj krjVar) {
        return true;
    }

    @Override // defpackage.krz
    public String r(ksa ksaVar, Resources resources) {
        return resources.getString(b(ksaVar));
    }

    @Override // defpackage.krz
    public String s(ksa ksaVar, Resources resources) {
        return resources.getString(f(ksaVar));
    }

    @Override // defpackage.ksb
    public boolean v(krs krsVar, ksa ksaVar, boolean z) {
        return false;
    }

    @Override // defpackage.krz
    public boolean w(kqy kqyVar, ksa ksaVar) {
        return true;
    }

    @Override // defpackage.krz
    public final void C() {
    }

    @Override // defpackage.krz
    public /* synthetic */ void ec(krj krjVar) {
    }

    @Override // defpackage.krz
    public void ed(kqy kqyVar, boolean z) {
    }
}
