package defpackage;

import com.google.android.apps.camera.jni.serengeti.SerengetiNative;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ioh extends uhp {
    public /* synthetic */ Object a;
    final /* synthetic */ SerengetiNative b;
    public int c;
    public iof d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ioh(SerengetiNative serengetiNative, uhb uhbVar) {
        super(uhbVar);
        this.b = serengetiNative;
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
