package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import com.google.android.camera.experimental2019.ExperimentalKeys;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nvk {
    public static final CaptureResult.Key a;
    public static final CaptureRequest.Key b;
    public static final CaptureResult.Key c;
    public static final CameraCharacteristics.Key d;
    public static final CaptureRequest.Key e;
    public static final CaptureResult.Key f;
    public static final CaptureResult.Key g;
    public static final CaptureResult.Key h;
    public static final CaptureResult.Key i;
    public static final CaptureRequest.Key j;
    public static final CaptureRequest.Key k;
    public static final CaptureRequest.Key l;
    public static final CaptureResult.Key m;
    private static final boolean n = nvr.b(4);
    private static final boolean o;
    private static final boolean p;
    private static final boolean q;
    private static final boolean r;
    private static final boolean s;
    private static final boolean t;
    private static final boolean u;

    static {
        boolean zB = nvr.b(5);
        o = zB;
        boolean zB2 = nvr.b(6);
        p = zB2;
        boolean zB3 = nvr.b(7);
        q = zB3;
        boolean zB4 = nvr.b(8);
        r = zB4;
        boolean zB5 = nvr.b(10);
        s = zB5;
        boolean zB6 = nvr.b(11);
        t = zB6;
        boolean zB7 = nvr.b(13);
        u = zB7;
        if (a(1)) {
            CaptureRequest.Key key = ExperimentalKeys.REQUEST_LENS_SHADING_STATS_ENABLED;
        } else if (zB) {
            CaptureRequest.Key key2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_LENS_SHADING_STATS_ENABLED;
        } else if (zB2) {
            CaptureRequest.Key key3 = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_LENS_SHADING_STATS_ENABLED;
        } else if (zB3) {
            CaptureRequest.Key key4 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_LENS_SHADING_STATS_ENABLED;
        } else if (zB4) {
            CaptureRequest.Key key5 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_LENS_SHADING_STATS_ENABLED;
        } else if (zB5) {
            CaptureRequest.Key key6 = com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_LENS_SHADING_STATS_ENABLED;
        } else if (zB6) {
            CaptureRequest.Key key7 = com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_LENS_SHADING_STATS_ENABLED;
        } else if (zB7) {
            CaptureRequest.Key key8 = com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_LENS_SHADING_STATS_ENABLED;
        }
        if (a(1)) {
            CaptureResult.Key key9 = ExperimentalKeys.RESULT_LENS_SHADING_STATS_ENABLED;
        } else if (zB) {
            CaptureResult.Key key10 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_LENS_SHADING_STATS_ENABLED;
        } else if (zB2) {
            CaptureResult.Key key11 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_LENS_SHADING_STATS_ENABLED;
        } else if (zB3) {
            CaptureResult.Key key12 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_LENS_SHADING_STATS_ENABLED;
        } else if (zB4) {
            CaptureResult.Key key13 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_LENS_SHADING_STATS_ENABLED;
        } else if (zB5) {
            CaptureResult.Key key14 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_LENS_SHADING_STATS_ENABLED;
        } else if (zB6) {
            CaptureResult.Key key15 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_LENS_SHADING_STATS_ENABLED;
        } else if (zB7) {
            CaptureResult.Key key16 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_LENS_SHADING_STATS_ENABLED;
        }
        if (a(1)) {
            CaptureResult.Key key17 = ExperimentalKeys.RESULT_LENS_SHADING_STATS;
        } else if (zB) {
            CaptureResult.Key key18 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_LENS_SHADING_STATS;
        } else if (zB2) {
            CaptureResult.Key key19 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_LENS_SHADING_STATS;
        } else if (zB3) {
            CaptureResult.Key key20 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_LENS_SHADING_STATS;
        } else if (zB4) {
            CaptureResult.Key key21 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_LENS_SHADING_STATS;
        } else if (zB5) {
            CaptureResult.Key key22 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_LENS_SHADING_STATS;
        } else if (zB6) {
            CaptureResult.Key key23 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_LENS_SHADING_STATS;
        } else if (zB7) {
            CaptureResult.Key key24 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_LENS_SHADING_STATS;
        }
        if (a(2)) {
            CaptureRequest.Key key25 = ExperimentalKeys.REQUEST_GCAM_AE_MOTION_EF_ENABLED;
        } else if (zB) {
            CaptureRequest.Key key26 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_GCAM_AE_MOTION_EF_ENABLED;
        } else if (zB2) {
            CaptureRequest.Key key27 = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_GCAM_AE_MOTION_EF_ENABLED;
        } else if (zB3) {
            CaptureRequest.Key key28 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_GCAM_AE_MOTION_EF_ENABLED;
        } else if (zB4) {
            CaptureRequest.Key key29 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_GCAM_AE_MOTION_EF_ENABLED;
        } else if (zB5) {
            CaptureRequest.Key key30 = com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_GCAM_AE_MOTION_EF_ENABLED;
        } else if (zB6) {
            CaptureRequest.Key key31 = com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_GCAM_AE_MOTION_EF_ENABLED;
        } else if (zB7) {
            CaptureRequest.Key key32 = com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_GCAM_AE_MOTION_EF_ENABLED;
        }
        if (a(2)) {
            CaptureResult.Key key33 = ExperimentalKeys.RESULT_GCAM_AE_MOTION_EF_ENABLED;
        } else if (zB) {
            CaptureResult.Key key34 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_GCAM_AE_MOTION_EF_ENABLED;
        } else if (zB2) {
            CaptureResult.Key key35 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_GCAM_AE_MOTION_EF_ENABLED;
        } else if (zB3) {
            CaptureResult.Key key36 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_GCAM_AE_MOTION_EF_ENABLED;
        } else if (zB4) {
            CaptureResult.Key key37 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_GCAM_AE_MOTION_EF_ENABLED;
        } else if (zB5) {
            CaptureResult.Key key38 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_GCAM_AE_MOTION_EF_ENABLED;
        } else if (zB6) {
            CaptureResult.Key key39 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_GCAM_AE_MOTION_EF_ENABLED;
        } else if (zB7) {
            CaptureResult.Key key40 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_GCAM_AE_MOTION_EF_ENABLED;
        }
        CaptureResult.Key key41 = null;
        a = a(2) ? ExperimentalKeys.RESULT_GCAM_AE_OUTPUT : zB ? com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_GCAM_AE_OUTPUT : zB2 ? com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_GCAM_AE_OUTPUT : zB3 ? com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_GCAM_AE_OUTPUT : zB4 ? com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_GCAM_AE_OUTPUT : zB5 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_GCAM_AE_OUTPUT : zB6 ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_GCAM_AE_OUTPUT : zB7 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_GCAM_AE_OUTPUT : null;
        b = a(2) ? ExperimentalKeys.REQUEST_LIVE_HDR_SETTINGS : zB ? com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_LIVE_HDR_SETTINGS : zB2 ? com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_LIVE_HDR_SETTINGS : zB3 ? com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_LIVE_HDR_SETTINGS : zB4 ? com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_LIVE_HDR_SETTINGS : zB5 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_LIVE_HDR_SETTINGS : zB6 ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_LIVE_HDR_SETTINGS : zB7 ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_LIVE_HDR_SETTINGS : null;
        c = a(2) ? ExperimentalKeys.RESULT_LIVE_HDR_SETTINGS : zB ? com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_LIVE_HDR_SETTINGS : zB2 ? com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_LIVE_HDR_SETTINGS : zB3 ? com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_LIVE_HDR_SETTINGS : zB4 ? com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_LIVE_HDR_SETTINGS : zB5 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_LIVE_HDR_SETTINGS : zB6 ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_LIVE_HDR_SETTINGS : zB7 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_LIVE_HDR_SETTINGS : null;
        if (a(3)) {
            CaptureRequest.Key key42 = ExperimentalKeys.REQUEST_IPE_INFO_ENABLED;
        } else if (zB) {
            CaptureRequest.Key key43 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_IPE_INFO_ENABLED;
        } else if (zB2) {
            CaptureRequest.Key key44 = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_IPE_INFO_ENABLED;
        }
        if (a(3)) {
            CaptureResult.Key key45 = ExperimentalKeys.RESULT_IPE_INFO_ENABLED;
        } else if (zB) {
            CaptureResult.Key key46 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_IPE_INFO_ENABLED;
        } else if (zB2) {
            CaptureResult.Key key47 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_IPE_INFO_ENABLED;
        }
        if (a(3)) {
            CaptureResult.Key key48 = ExperimentalKeys.RESULT_IPE_INFO;
        } else if (zB) {
            CaptureResult.Key key49 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_IPE_INFO;
        } else if (zB2) {
            CaptureResult.Key key50 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_IPE_INFO;
        }
        if (a(3)) {
            CaptureRequest.Key key51 = ExperimentalKeys.REQUEST_IFE_INFO_ENABLED;
        } else if (zB) {
            CaptureRequest.Key key52 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_IFE_INFO_ENABLED;
        } else if (zB2) {
            CaptureRequest.Key key53 = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_IFE_INFO_ENABLED;
        }
        if (a(3)) {
            CaptureResult.Key key54 = ExperimentalKeys.RESULT_IFE_INFO_ENABLED;
        } else if (zB) {
            CaptureResult.Key key55 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_IFE_INFO_ENABLED;
        } else if (zB2) {
            CaptureResult.Key key56 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_IFE_INFO_ENABLED;
        }
        if (a(3)) {
            CaptureResult.Key key57 = ExperimentalKeys.RESULT_IFE_INFO;
        } else if (zB) {
            CaptureResult.Key key58 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_IFE_INFO;
        } else if (zB2) {
            CaptureResult.Key key59 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_IFE_INFO;
        }
        if (a(3)) {
            CaptureRequest.Key key60 = ExperimentalKeys.REQUEST_BPS_INFO_ENABLED;
        } else if (zB) {
            CaptureRequest.Key key61 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_BPS_INFO_ENABLED;
        } else if (zB2) {
            CaptureRequest.Key key62 = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_BPS_INFO_ENABLED;
        }
        if (a(3)) {
            CaptureResult.Key key63 = ExperimentalKeys.RESULT_BPS_INFO_ENABLED;
        } else if (zB) {
            CaptureResult.Key key64 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_BPS_INFO_ENABLED;
        } else if (zB2) {
            CaptureResult.Key key65 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_BPS_INFO_ENABLED;
        }
        if (a(3)) {
            CaptureResult.Key key66 = ExperimentalKeys.RESULT_BPS_INFO;
        } else if (zB) {
            CaptureResult.Key key67 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_BPS_INFO;
        } else if (zB2) {
            CaptureResult.Key key68 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_BPS_INFO;
        }
        d = a(4) ? ExperimentalKeys.CHARACTERISTICS_MESH_WARP_AVAILABLE_MODES : zB ? com.google.android.camera.experimental2020_midyear.ExperimentalKeys.CHARACTERISTICS_MESH_WARP_AVAILABLE_MODES : zB2 ? com.google.android.camera.experimental2020.ExperimentalKeys.CHARACTERISTICS_MESH_WARP_AVAILABLE_MODES : zB3 ? com.google.android.camera.experimental2021.ExperimentalKeys.CHARACTERISTICS_MESH_WARP_AVAILABLE_MODES : zB4 ? com.google.android.camera.experimental2022.ExperimentalKeys.CHARACTERISTICS_MESH_WARP_AVAILABLE_MODES : zB5 ? com.google.android.camera.experimental2023.ExperimentalKeys.CHARACTERISTICS_MESH_WARP_AVAILABLE_MODES : zB6 ? com.google.android.camera.experimental2024.ExperimentalKeys.CHARACTERISTICS_MESH_WARP_AVAILABLE_MODES : zB7 ? com.google.android.camera.experimental2025.ExperimentalKeys.CHARACTERISTICS_MESH_WARP_AVAILABLE_MODES : null;
        e = a(4) ? ExperimentalKeys.REQUEST_MESH_WARP_MODE : zB ? com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_MESH_WARP_MODE : zB2 ? com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_MESH_WARP_MODE : zB3 ? com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_MESH_WARP_MODE : zB4 ? com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_MESH_WARP_MODE : zB5 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_MESH_WARP_MODE : zB6 ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_MESH_WARP_MODE : zB7 ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_MESH_WARP_MODE : null;
        if (a(4)) {
            CaptureResult.Key key69 = ExperimentalKeys.RESULT_MESH_WARP_MODE;
        } else if (zB) {
            CaptureResult.Key key70 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_MESH_WARP_MODE;
        } else if (zB2) {
            CaptureResult.Key key71 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_MESH_WARP_MODE;
        } else if (zB3) {
            CaptureResult.Key key72 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_MESH_WARP_MODE;
        } else if (zB4) {
            CaptureResult.Key key73 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_MESH_WARP_MODE;
        } else if (zB5) {
            CaptureResult.Key key74 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_MESH_WARP_MODE;
        } else if (zB6) {
            CaptureResult.Key key75 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_MESH_WARP_MODE;
        } else if (zB7) {
            CaptureResult.Key key76 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_MESH_WARP_MODE;
        }
        f = a(4) ? ExperimentalKeys.RESULT_MESH_WARP_SIZE : zB ? com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_MESH_WARP_SIZE : zB2 ? com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_MESH_WARP_SIZE : zB3 ? com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_MESH_WARP_SIZE : zB4 ? com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_MESH_WARP_SIZE : zB5 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_MESH_WARP_SIZE : zB6 ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_MESH_WARP_SIZE : zB7 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_MESH_WARP_SIZE : null;
        g = a(4) ? ExperimentalKeys.RESULT_MESH_WARP_CROP_REGION : zB ? com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_MESH_WARP_CROP_REGION : zB2 ? com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_MESH_WARP_CROP_REGION : zB3 ? com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_MESH_WARP_CROP_REGION : zB4 ? com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_MESH_WARP_CROP_REGION : zB5 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_MESH_WARP_CROP_REGION : zB6 ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_MESH_WARP_CROP_REGION : zB7 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_MESH_WARP_CROP_REGION : null;
        h = a(4) ? ExperimentalKeys.RESULT_MESH_WARP_DATA : zB ? com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_MESH_WARP_DATA : zB2 ? com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_MESH_WARP_DATA : zB3 ? com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_MESH_WARP_DATA : zB4 ? com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_MESH_WARP_DATA : zB5 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_MESH_WARP_DATA : zB6 ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_MESH_WARP_DATA : zB7 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_MESH_WARP_DATA : null;
        i = a(8) ? ExperimentalKeys.RESULT_MESH_WARP_IS_IDENTITY_TRANSFORM : zB ? com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_MESH_WARP_IS_IDENTITY_TRANSFORM : zB2 ? com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_MESH_WARP_IS_IDENTITY_TRANSFORM : zB3 ? com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_MESH_WARP_IS_IDENTITY_TRANSFORM : zB4 ? com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_MESH_WARP_IS_IDENTITY_TRANSFORM : zB5 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_MESH_WARP_IS_IDENTITY_TRANSFORM : zB6 ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_MESH_WARP_IS_IDENTITY_TRANSFORM : zB7 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_MESH_WARP_IS_IDENTITY_TRANSFORM : null;
        j = a(5) ? ExperimentalKeys.REQUEST_HDRNET_MODE : zB ? com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_HDRNET_MODE : zB2 ? com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_HDRNET_MODE : zB3 ? com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_HDRNET_MODE : zB4 ? com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_HDRNET_MODE : zB5 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_HDRNET_MODE : zB6 ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_HDRNET_MODE : zB7 ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_HDRNET_MODE : null;
        if (a(5)) {
            CaptureResult.Key key77 = ExperimentalKeys.RESULT_HDRNET_MODE;
        } else if (zB) {
            CaptureResult.Key key78 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_HDRNET_MODE;
        } else if (zB2) {
            CaptureResult.Key key79 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_HDRNET_MODE;
        } else if (zB3) {
            CaptureResult.Key key80 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_HDRNET_MODE;
        } else if (zB4) {
            CaptureResult.Key key81 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_HDRNET_MODE;
        } else if (zB5) {
            CaptureResult.Key key82 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_HDRNET_MODE;
        } else if (zB6) {
            CaptureResult.Key key83 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_HDRNET_MODE;
        } else if (zB7) {
            CaptureResult.Key key84 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_HDRNET_MODE;
        }
        k = a(6) ? ExperimentalKeys.REQUEST_AUTO_3A_SCENE_MODE : zB ? com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_AUTO_3A_SCENE_MODE : zB2 ? com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_AUTO_3A_SCENE_MODE : zB3 ? com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_AUTO_3A_SCENE_MODE : zB4 ? com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_AUTO_3A_SCENE_MODE : zB5 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_AUTO_3A_SCENE_MODE : zB6 ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_AUTO_3A_SCENE_MODE : zB7 ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_AUTO_3A_SCENE_MODE : null;
        if (a(6)) {
            CaptureResult.Key key85 = ExperimentalKeys.RESULT_AUTO_3A_SCENE_MODE;
        } else if (zB) {
            CaptureResult.Key key86 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_AUTO_3A_SCENE_MODE;
        } else if (zB2) {
            CaptureResult.Key key87 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_AUTO_3A_SCENE_MODE;
        } else if (zB3) {
            CaptureResult.Key key88 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_AUTO_3A_SCENE_MODE;
        } else if (zB4) {
            CaptureResult.Key key89 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_AUTO_3A_SCENE_MODE;
        } else if (zB5) {
            CaptureResult.Key key90 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_AUTO_3A_SCENE_MODE;
        } else if (zB6) {
            CaptureResult.Key key91 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_AUTO_3A_SCENE_MODE;
        } else if (zB7) {
            CaptureResult.Key key92 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_AUTO_3A_SCENE_MODE;
        }
        l = a(7) ? ExperimentalKeys.REQUEST_AF_RESCAN_FRAME_COUNT : zB ? com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_AF_RESCAN_FRAME_COUNT : zB2 ? com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_AF_RESCAN_FRAME_COUNT : zB3 ? com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_AF_RESCAN_FRAME_COUNT : zB4 ? com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_AF_RESCAN_FRAME_COUNT : zB5 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_AF_RESCAN_FRAME_COUNT : zB6 ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_AF_RESCAN_FRAME_COUNT : zB7 ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_AF_RESCAN_FRAME_COUNT : null;
        if (a(7)) {
            key41 = ExperimentalKeys.RESULT_AF_RESCAN_FRAME_COUNT;
        } else if (zB) {
            key41 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_AF_RESCAN_FRAME_COUNT;
        } else if (zB2) {
            key41 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_AF_RESCAN_FRAME_COUNT;
        } else if (zB3) {
            key41 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_AF_RESCAN_FRAME_COUNT;
        } else if (zB4) {
            key41 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_AF_RESCAN_FRAME_COUNT;
        } else if (zB5) {
            key41 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_AF_RESCAN_FRAME_COUNT;
        } else if (zB6) {
            key41 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_AF_RESCAN_FRAME_COUNT;
        } else if (zB7) {
            key41 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_AF_RESCAN_FRAME_COUNT;
        }
        m = key41;
        if (a(10)) {
            CaptureRequest.Key key93 = ExperimentalKeys.REQUEST_SENSOR_MODE_FULLFOV;
        } else if (zB) {
            CaptureRequest.Key key94 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_SENSOR_MODE_FULLFOV;
        } else if (zB2) {
            CaptureRequest.Key key95 = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_SENSOR_MODE_FULLFOV;
        } else if (zB3) {
            CaptureRequest.Key key96 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_SENSOR_MODE_FULLFOV;
        } else if (zB4) {
            CaptureRequest.Key key97 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_SENSOR_MODE_FULLFOV;
        } else if (zB5) {
            CaptureRequest.Key key98 = com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_SENSOR_MODE_FULLFOV;
        } else if (zB6) {
            CaptureRequest.Key key99 = com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_SENSOR_MODE_FULLFOV;
        } else if (zB7) {
            CaptureRequest.Key key100 = com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_SENSOR_MODE_FULLFOV;
        }
        if (a(10)) {
            CaptureResult.Key key101 = ExperimentalKeys.RESULT_SENSOR_MODE_FULLFOV;
        } else if (zB) {
            CaptureResult.Key key102 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_SENSOR_MODE_FULLFOV;
        } else if (zB2) {
            CaptureResult.Key key103 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_SENSOR_MODE_FULLFOV;
        } else if (zB3) {
            CaptureResult.Key key104 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_SENSOR_MODE_FULLFOV;
        } else if (zB4) {
            CaptureResult.Key key105 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_SENSOR_MODE_FULLFOV;
        } else if (zB5) {
            CaptureResult.Key key106 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_SENSOR_MODE_FULLFOV;
        } else if (zB6) {
            CaptureResult.Key key107 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_SENSOR_MODE_FULLFOV;
        } else if (zB7) {
            CaptureResult.Key key108 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_SENSOR_MODE_FULLFOV;
        }
        if (a(11)) {
            CaptureResult.Key key109 = ExperimentalKeys.RESULT_RLS_ENABLE;
            return;
        }
        if (nvl.a(3)) {
            CaptureResult.Key key110 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_RLS_ENABLE;
            return;
        }
        if (zB3) {
            CaptureResult.Key key111 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_RLS_ENABLE;
            return;
        }
        if (zB4) {
            CaptureResult.Key key112 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_RLS_ENABLE;
            return;
        }
        if (zB5) {
            CaptureResult.Key key113 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_RLS_ENABLE;
        } else if (zB6) {
            CaptureResult.Key key114 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_RLS_ENABLE;
        } else if (zB7) {
            CaptureResult.Key key115 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_RLS_ENABLE;
        }
    }

    private static boolean a(int i2) {
        if (n) {
            try {
                if (i2 <= ExperimentalKeys.getLibraryVersion()) {
                    return true;
                }
            } catch (NoSuchFieldError | NoSuchMethodError unused) {
            }
        }
        return false;
    }
}
