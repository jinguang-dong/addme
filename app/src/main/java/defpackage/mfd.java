package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mfd extends mex {
    public mfd(pql pqlVar) {
        super(pqlVar, mfc.values());
    }

    public final void a() {
        j(mfc.MEDIA_RECORDER_PREPARE_END);
    }

    public long getMediaRecorderPrepareEndNs() {
        return i(mfc.MEDIA_RECORDER_PREPARE_END);
    }

    public long getMediaRecorderPrepareStartNs() {
        return i(mfc.MEDIA_RECORDER_PREPARE_START);
    }
}
