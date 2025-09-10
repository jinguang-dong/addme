package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gly extends owx {
    public gly(owq owqVar) {
        super(owqVar);
    }

    @Override // defpackage.owx
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        return "torch".equals((String) obj) ? ksa.VIDEO_FLASH_ON : ksa.VIDEO_FLASH_OFF;
    }

    @Override // defpackage.owx
    protected final /* bridge */ /* synthetic */ Object c(Object obj) {
        return true != ksa.VIDEO_FLASH_ON.equals((ksa) obj) ? "off" : "torch";
    }
}
