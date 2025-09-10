package defpackage;

import com.google.android.libraries.pixel.tips.convtrak.ConversionEventWorker;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rav extends uhp {
    public /* synthetic */ Object a;
    final /* synthetic */ ConversionEventWorker b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rav(ConversionEventWorker conversionEventWorker, uhb uhbVar) {
        super(uhbVar);
        this.b = conversionEventWorker;
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
