package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uqk {
    public static final uqr a = new uqr(-1, null, null, 0);
    public static final int b = ukc.ac("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);
    public static final int c = ukc.ac("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12);
    public static final uwc d = new uwc("BUFFERED");
    public static final uwc e = new uwc("SHOULD_BUFFER");
    public static final uwc f = new uwc("S_RESUMING_BY_RCV");
    public static final uwc g = new uwc("RESUMING_BY_EB");
    public static final uwc h = new uwc("POISONED");
    public static final uwc i = new uwc("DONE_RCV");
    public static final uwc j = new uwc("INTERRUPTED_SEND");
    public static final uwc k = new uwc("INTERRUPTED_RCV");
    public static final uwc l = new uwc("CHANNEL_CLOSED");
    public static final uwc m = new uwc("SUSPEND");
    public static final uwc n = new uwc("SUSPEND_NO_WAITER");
    public static final uwc o = new uwc("FAILED");
    public static final uwc p = new uwc("NO_RECEIVE_RESULT");
    public static final uwc q = new uwc("CLOSE_HANDLER_CLOSED");
    public static final uwc r = new uwc("CLOSE_HANDLER_INVOKED");
    public static final uwc s = new uwc("NO_CLOSE_CAUSE");

    public static final long a(long j2, boolean z) {
        return (true != z ? 0L : 4611686018427387904L) + j2;
    }

    public static final long b(long j2, int i2) {
        return (i2 << 60) + j2;
    }

    public static final boolean c(umk umkVar, Object obj, uiv uivVar) {
        Object objH = umkVar.h(obj, uivVar);
        if (objH == null) {
            return false;
        }
        umkVar.c(objH);
        return true;
    }
}
