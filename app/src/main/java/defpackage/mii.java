package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum mii {
    STATE_UNINITIALIZED,
    STATE_PREPARING_ON_START,
    STATE_IDLE,
    STATE_PRE_RECORDING,
    STATE_RECORDING_PAUSE,
    STATE_RECORDING,
    STATE_PROCESSING,
    STATE_RECORDING_ERROR;

    static boolean a(mii miiVar) {
        return miiVar.equals(STATE_RECORDING_PAUSE) || miiVar.equals(STATE_RECORDING) || miiVar.equals(STATE_RECORDING_ERROR);
    }
}
